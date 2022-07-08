package com.mycompany.car_center.controllers;

import com.mycompany.car_center.dto.MecanicoDto;
import com.mycompany.car_center.entities.ServiciosXMantenimientoEntity;
import com.mycompany.car_center.services.ServiciosXMantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/serviciosxmantenimiento")
public class ServiciosXMantenimientoController {

    @Autowired
    ServiciosXMantenimientoService service;

    @GetMapping("/getmantenimientos")
    public ResponseEntity<List<MecanicoDto>> getMantenimientos(){
        System.out.println("Se van a consultar los mantenimientos filtrados");
        List<MecanicoDto> mantenimientos = service.getMantenimientos();
        System.out.println("Se consultaron los mantenimientos filtrados");
        return new ResponseEntity<>(mantenimientos, HttpStatus.OK);
    }
}
