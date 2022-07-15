package com.sofka.ExamenNivelacion.service;

import com.sofka.ExamenNivelacion.dto.CiclistaDTO;
import com.sofka.ExamenNivelacion.models.Ciclista;
import com.sofka.ExamenNivelacion.repositories.CiclistaRepository;
import com.sofka.ExamenNivelacion.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CiclistaService {

    @Autowired
    private CiclistaRepository ciclistaRepository;

    public Flux<CiclistaDTO>getCiclistas(){
        return ciclistaRepository.findAll().map(AppUtils::entityToDto);
    }

    public Mono<CiclistaDTO> getCiclistaById(String id){
        return ciclistaRepository.findById(id).map(AppUtils::entityToDto);
    }

    public Mono<CiclistaDTO> saveCiclista(Mono<CiclistaDTO> ciclistaDTOMono){
        return ciclistaDTOMono.map(AppUtils::DtoToEntity)
                .flatMap(ciclistaRepository::insert)
                .map(AppUtils::entityToDto);
    }
}
