package com.settannim.esercizio2.client;

import com.settannim.esercizio2.client.model.ProdottoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(url = "http://localhost:8080" , name = "product-client")
public interface ProductClient {
    @GetMapping("/{id}/dto")
    public ResponseEntity<ProdottoDTO> findById(@PathVariable int id);
}
