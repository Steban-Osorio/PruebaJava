package com.mycompany.car_center.controllers;


import com.mycompany.car_center.entities.MantenimientosEntity;
import com.mycompany.car_center.entities.MecanicosEntity;
import com.mycompany.car_center.services.MantenimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mantenimientos")
public class MantenimientosController {

    @Autowired
    MantenimientosService service;

    @GetMapping("/getmantenimientos")
    public ResponseEntity<List<MantenimientosEntity>> getMantenimientos(){
        System.out.println("Se van a consultar los mantenimientos filtrados");
        List<MantenimientosEntity> mantenimientos = service.getMantenimientos();
        System.out.println("Se consultaron los mantenimientos filtrados");
        return new ResponseEntity<>(mantenimientos, HttpStatus.OK);
    }

}
