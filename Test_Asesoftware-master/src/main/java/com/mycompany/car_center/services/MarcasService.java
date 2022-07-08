package com.mycompany.car_center.services;

import com.mycompany.car_center.entities.MarcasEntity;
import com.mycompany.car_center.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcasService {

    @Autowired
    private MarcaRepository repository;


    public MarcasEntity saveMarca(String marca) {
        MarcasEntity entity = new MarcasEntity();
        entity.setNombreMarca(marca);
        return repository.save(entity);
    }

    public List<MarcasEntity> getAllMarcas() {
        return (List<MarcasEntity>) repository.findAll();
    }

    public Optional<MarcasEntity> getMarcaById(Integer id) {
        return repository.findById(id);
    }
}
