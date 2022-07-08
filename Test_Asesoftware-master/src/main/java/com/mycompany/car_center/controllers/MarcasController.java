package com.mycompany.car_center.controllers;

import com.mycompany.car_center.entities.MarcasEntity;
import com.mycompany.car_center.services.MarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
public class MarcasController {

    @Autowired
    private MarcasService service;

    @PostMapping()
    public ResponseEntity<MarcasEntity> saveMarca(@RequestParam String nombreMarca) {
        System.out.println("Va a crear la marca de carro --> " + nombreMarca);
        MarcasEntity marca = service.saveMarca(nombreMarca);
        System.out.println("Se creo la marca --> " + marca.getNombreMarca() + " con el id --> " + marca.getCodigo());
        return new ResponseEntity<>(marca, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<MarcasEntity>> getAllMarcas() {
        System.out.println("Se van a consultar todas las marcas");
        List<MarcasEntity> marcas = service.getAllMarcas();
        System.out.println("Se consultaron todas las marcas");
        return new ResponseEntity<>(marcas, HttpStatus.OK);
    }

    @GetMapping("/byId")
    public ResponseEntity<MarcasEntity> getMarcaById(@RequestParam Integer id) {
        System.out.println("Va a consultar la marca de carro con id --> " + id);
        Optional<MarcasEntity> marcaOpt = service.getMarcaById(id);
        if(marcaOpt.isPresent()) {
            MarcasEntity marca = marcaOpt.get();
            System.out.println("Se consulto la marca --> " + marca.getNombreMarca() + " con el id --> " + marca.getCodigo());
            return new ResponseEntity<>(marca, HttpStatus.OK);
        } else {
            System.out.println("No se encontró la marca de carro con id --> " + id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}
