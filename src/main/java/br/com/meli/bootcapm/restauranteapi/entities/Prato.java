package br.com.meli.bootcapm.restauranteapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Prato {

    private Integer id;
    private Double preco;
    private String descricao;
    private Integer quantidade;
}
