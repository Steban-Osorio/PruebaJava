package com.mycompany.car_center.services;

import com.mycompany.car_center.entities.MantenimientosEntity;
import com.mycompany.car_center.entities.MecanicosEntity;
import com.mycompany.car_center.repositories.MantenimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class MantenimientosService {
    Pageable pageable;
    @Autowired
    MantenimientosRepository repository;

    public List<MantenimientosEntity> getMantenimientos(){
        return (List<MantenimientosEntity>) repository.findAllCustom(pageable);
    }

}
