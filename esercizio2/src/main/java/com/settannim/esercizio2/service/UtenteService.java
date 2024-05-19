package com.settannim.esercizio2.service;

import com.settannim.esercizio2.entity.Utente;
import com.settannim.esercizio2.model.UtenteDTO;

public interface UtenteService {
    UtenteDTO findById(int theId) throws Exception;
    UtenteDTO save(UtenteDTO theUtente) throws Exception;
}
