package br.com.meli.bootcapm.restauranteapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pedido {
    private Integer id;
    private Mesa mesa;
    private List<Prato> listaPratos;
    Double valorTotal;

}
