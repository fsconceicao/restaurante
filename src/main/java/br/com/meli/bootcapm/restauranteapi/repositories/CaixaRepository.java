package br.com.meli.bootcapm.restauranteapi.repositories;

import br.com.meli.bootcapm.restauranteapi.entities.Pedido;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CaixaRepository {

    Map<LocalDate, List<Pedido>> caixa= new HashMap<>();

    public void salvar(List<Pedido> listaDePedidos){

        caixa.put(LocalDate.now(),listaDePedidos);
    }
}
