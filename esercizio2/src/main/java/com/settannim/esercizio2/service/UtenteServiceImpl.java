package com.settannim.esercizio2.service;

import com.settannim.esercizio2.client.ProductClient;
import com.settannim.esercizio2.entity.Utente;
import com.settannim.esercizio2.mapper.UtenteMapper;
import com.settannim.esercizio2.model.UtenteDTO;
import com.settannim.esercizio2.repository.UtenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtenteServiceImpl implements UtenteService {

    private final UtenteRepository utenteRepository;
    private final UtenteMapper utenteMapper;
    private final ProductClient productClient;

    @Override
    public UtenteDTO findById(int theId) throws Exception{
        Utente utente = utenteRepository.findById(theId).orElseThrow();
        return utenteMapper.toDTO(utente);
    }

    public UtenteDTO findByUsername (String username) throws Exception {
        Utente utente = utenteRepository.findByUsername(username).orElseThrow(()->new RuntimeException("username not found " + username
        ));
        return utenteMapper.toDTO(utente);
    }

    @Override
    public UtenteDTO save(UtenteDTO theUtente) throws Exception{
        Optional<Utente> utente = utenteRepository.findByUsername(theUtente.getUsername());
        if(utente.isPresent()){
            throw new Exception("user already exists by name: " + theUtente.getUsername());
        }
        Utente newUtente = utenteMapper.toEntity(theUtente);
        newUtente = utenteRepository.save(newUtente);
        return utenteMapper.toDTO(newUtente);
    }
}
