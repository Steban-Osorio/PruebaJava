package com.mycompany.car_center.services;

import com.mycompany.car_center.dto.MecanicoDto;
import com.mycompany.car_center.entities.ServiciosXMantenimientoEntity;
import com.mycompany.car_center.repositories.ServiciosXMantenimientoRepository;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ServiciosXMantenimientoService {
    Pageable pageable;
    @Autowired
    ServiciosXMantenimientoRepository repository;

    public List<MecanicoDto> getMantenimientos(){
        List<ServiciosXMantenimientoEntity> listaMantenimiento = repository.findAllCustom();
        Map<Integer, MecanicoDto> mapa = new HashMap<>();
        for(ServiciosXMantenimientoEntity temp: listaMantenimiento){
            Integer documentoMecanico = temp.getMantenimientosByCodMantenimiento().getMecanicos().getDocumento();
            MecanicoDto mecanico;
                if(mapa.containsKey(documentoMecanico)){
                    mecanico  = mapa.get(documentoMecanico);
                    Integer tiempoTrabajado = mecanico.getTiempo();
                    mecanico.setTiempo(tiempoTrabajado + temp.getTiempoEstimado());
                }else{
                    mecanico = new MecanicoDto();
                    mecanico.setTipoDocumento(temp.getMantenimientosByCodMantenimiento().getMecanicos().getTipoDocumento());
                    mecanico.setDocumento(temp.getMantenimientosByCodMantenimiento().getMecanicos().getDocumento());
                    mecanico.setCelular(temp.getMantenimientosByCodMantenimiento().getMecanicos().getCelular());
                    mecanico.setDireccion(temp.getMantenimientosByCodMantenimiento().getMecanicos().getDireccion());
                    mecanico.setPrimerNombre(temp.getMantenimientosByCodMantenimiento().getMecanicos().getPrimerNombre());
                    mecanico.setSegundoNombre(temp.getMantenimientosByCodMantenimiento().getMecanicos().getSegundoNombre());
                    mecanico.setPrimerApellido(temp.getMantenimientosByCodMantenimiento().getMecanicos().getPrimerApellido());
                    mecanico.setSegundoApellido(temp.getMantenimientosByCodMantenimiento().getMecanicos().getSegundoApellido());
                    mecanico.setEmail(temp.getMantenimientosByCodMantenimiento().getMecanicos().getEmail());
                    mecanico.setEstado(temp.getMantenimientosByCodMantenimiento().getMecanicos().getEstado());
                    mecanico.setTiempo(temp.getTiempoEstimado());
                }
                mapa.put(documentoMecanico, mecanico);
        }
        List<MecanicoDto> result = new ArrayList<>(mapa.values());
        result.sort(Comparator.comparing(MecanicoDto::getTiempo));
        return result;
    }
}
