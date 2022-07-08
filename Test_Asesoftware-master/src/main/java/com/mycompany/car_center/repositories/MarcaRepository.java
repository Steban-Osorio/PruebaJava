package com.mycompany.car_center.repositories;


import com.mycompany.car_center.entities.MarcasEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface MarcaRepository extends CrudRepository<MarcasEntity, Integer> {

}
