package com.sofka.ExamenNivelacion.controller;

import com.sofka.ExamenNivelacion.dto.CiclistaDTO;
import com.sofka.ExamenNivelacion.service.CiclistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/ciclistas")
public class CiclistaController {
    @Autowired
    private CiclistaService ciclistaService;

    @GetMapping
    public Flux<CiclistaDTO> getCiclistas(){
        return ciclistaService.getCiclistas();
    }
}
