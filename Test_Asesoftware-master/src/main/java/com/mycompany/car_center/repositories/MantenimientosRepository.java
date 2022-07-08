package com.mycompany.car_center.repositories;

import com.mycompany.car_center.entities.MantenimientosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface MantenimientosRepository extends CrudRepository<MantenimientosEntity, Integer> {
    List<MantenimientosEntity> findAllCustom(Pageable pageable);
    List<MantenimientosEntity> findAllCustom();

}
