package com.mycompany.car_center.services;

import com.mycompany.car_center.dto.MecanicoDto;
import com.mycompany.car_center.entities.MecanicosEntity;
import com.mycompany.car_center.repositories.MarcaRepository;
import com.mycompany.car_center.repositories.MecanicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class MecanicosService {
    Pageable pageable;
    @Autowired
    MecanicosRepository repository;

    public MecanicosEntity saveMecanico(MecanicoDto mecanicoDto){
        MecanicosEntity mecanicosEntity = new MecanicosEntity();
        mecanicosEntity.setTipoDocumento(mecanicoDto.getTipoDocumento());
        mecanicosEntity.setEstado(mecanicoDto.getEstado());
        mecanicosEntity.setEmail(mecanicoDto.getEmail());
        mecanicosEntity.setDireccion(mecanicoDto.getDireccion());
        mecanicosEntity.setCelular(mecanicoDto.getCelular());
        mecanicosEntity.setSegundoApellido(mecanicoDto.getSegundoApellido());
        mecanicosEntity.setPrimerApellido(mecanicoDto.getPrimerApellido());
        mecanicosEntity.setPrimerNombre(mecanicoDto.getPrimerNombre());
        mecanicosEntity.setSegundoNombre(mecanicoDto.getSegundoNombre());
        mecanicosEntity.setDocumento(mecanicoDto.getDocumento());
        return repository.save(mecanicosEntity);
    }

    public List<MecanicosEntity> getAllMecanicos(){

        return (List<MecanicosEntity>) repository.findAll();
    }

//    public List<MecanicosEntity> getMantenimientos(){
//        return (List<MecanicosEntity>) repository.findAllCustom(pageable);
//    }

}
