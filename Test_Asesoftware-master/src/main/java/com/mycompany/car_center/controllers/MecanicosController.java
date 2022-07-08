package com.mycompany.car_center.controllers;

import com.mycompany.car_center.dto.MecanicoDto;
import com.mycompany.car_center.entities.MecanicosEntity;
import com.mycompany.car_center.services.MecanicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mecanicos")
public class MecanicosController {

    @Autowired
    MecanicosService service;

    @PostMapping("/save")
    public ResponseEntity<MecanicosEntity> saveMecanicos (@RequestBody MecanicoDto mecanicoDto){
        System.out.println("Va a crear el técnico --> " + mecanicoDto.getPrimerNombre());
        MecanicosEntity mecanico = service.saveMecanico(mecanicoDto);
        System.out.println("Se creo el técnico --> " + mecanico.getPrimerNombre() + " " + mecanico.getPrimerApellido());
        return new ResponseEntity<>(mecanico, HttpStatus.CREATED);
    }

    @GetMapping("/mecanicos")
    public ResponseEntity<List<MecanicosEntity>> getAllMecanicos(){
        System.out.println("Se solicita la lista de Mecánicos");
        List<MecanicosEntity> mecanicos = service.getAllMecanicos();
        System.out.println("Se consulto la lista de Mecánicos");
        return new ResponseEntity<>(mecanicos, HttpStatus.OK);
    }

//    @GetMapping("/getmantenimientos")
//    public ResponseEntity<List<MecanicosEntity>> getMantenimientos(){
//        System.out.println("Se van a consultar los mantenimientos filtrados");
//        List<MecanicosEntity> mantenimientos = service.getMantenimientos();
//        System.out.println("Se consultaron los mantenimientos filtrados");
//        return new ResponseEntity<>(mantenimientos, HttpStatus.OK);
//    }
}
