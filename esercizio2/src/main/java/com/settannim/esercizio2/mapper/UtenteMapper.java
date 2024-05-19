package com.settannim.esercizio2.mapper;

import com.settannim.esercizio2.entity.Utente;
import com.settannim.esercizio2.model.UtenteDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UtenteMapper {
    UtenteDTO toDTO(Utente utente);
    Utente toEntity(UtenteDTO utenteDTO);
}
