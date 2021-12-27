package br.com.meli.bootcapm.restauranteapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Caixa {
    private double registroCaixa;
    private Map<LocalDate, List<Pedido>> listaPedidos = new HashMap<>();
}
