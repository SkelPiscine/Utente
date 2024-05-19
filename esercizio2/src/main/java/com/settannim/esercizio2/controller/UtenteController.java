package com.settannim.esercizio2.controller;

import com.settannim.esercizio2.model.UtenteDTO;
import com.settannim.esercizio2.service.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/prodotti")
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteService utenteService;

    @GetMapping("/{id}")
    public ResponseEntity<UtenteDTO> findById(@PathVariable int id) {
        try {
            UtenteDTO utenteDTO = utenteService.findById(id);
            return ResponseEntity.ok(utenteDTO);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<UtenteDTO> addUser(@RequestBody UtenteDTO theUtente){
        try {
            UtenteDTO utenteDTO = utenteService.save(theUtente);
            return ResponseEntity.ok(utenteDTO);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
