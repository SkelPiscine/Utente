package com.settannim.esercizio2.model;

import com.settannim.esercizio2.client.model.ProdottoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UtenteDTO {
    private int id;
    private String username;
    private String password;
    private List<ProdottoDTO> prodotti;
}
