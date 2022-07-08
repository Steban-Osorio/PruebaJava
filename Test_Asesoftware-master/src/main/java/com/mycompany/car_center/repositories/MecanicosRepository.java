package com.mycompany.car_center.repositories;


import com.mycompany.car_center.entities.MecanicosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface MecanicosRepository extends CrudRepository<MecanicosEntity, Integer> {
//    List<MecanicosEntity> findAllCustom(Pageable pageable);
//    List<MecanicosEntity> findAllCustom();
}
