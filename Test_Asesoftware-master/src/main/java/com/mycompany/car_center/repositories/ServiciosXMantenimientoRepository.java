package com.mycompany.car_center.repositories;

import com.mycompany.car_center.entities.ServiciosXMantenimientoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface ServiciosXMantenimientoRepository extends CrudRepository<ServiciosXMantenimientoEntity, Integer> {
    List<ServiciosXMantenimientoEntity> findAllCustom(Pageable pageable);
    List<ServiciosXMantenimientoEntity> findAllCustom();
}
