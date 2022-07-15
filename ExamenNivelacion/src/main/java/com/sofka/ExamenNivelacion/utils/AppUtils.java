package com.sofka.ExamenNivelacion.utils;

import com.sofka.ExamenNivelacion.dto.CiclistaDTO;
import com.sofka.ExamenNivelacion.models.Ciclista;
import org.springframework.beans.BeanUtils;

public class AppUtils {
    public static CiclistaDTO entityToDto(Ciclista ciclista){
        CiclistaDTO ciclistaDTO = new CiclistaDTO();
        BeanUtils.copyProperties(ciclista,ciclistaDTO);
        return ciclistaDTO;
    }
    public static Ciclista DtoToEntity(CiclistaDTO ciclistaDTO){
        Ciclista ciclista = new Ciclista();
        BeanUtils.copyProperties(ciclistaDTO,ciclista);
        return ciclista;
    }
}
