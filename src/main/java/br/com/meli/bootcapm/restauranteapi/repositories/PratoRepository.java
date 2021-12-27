package br.com.meli.bootcapm.restauranteapi.repositories;


import br.com.meli.bootcapm.restauranteapi.entities.Pedido;
import br.com.meli.bootcapm.restauranteapi.entities.Prato;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PratoRepository {
    private static Map<Integer, Prato> pratoMap = new HashMap<>();
    private static Integer idGlobal = 1;

    public Prato salvar(Prato prato) {
        prato.setId(idGlobal);
        pratoMap.put(idGlobal++, prato);
        return prato;
    }

    public List<Prato> buscarTodos () {
        List<Prato> listaPratos = new ArrayList<>();
        for(Prato p: pratoMap.values())
            listaPratos.add(p);
        return listaPratos;
    }

    public Prato buscarPorId(Integer id) {
        return pratoMap.get(id);
    }

    public void deletarPorId(Integer id){
        pratoMap.remove(id);
    }
}
