package br.com.meli.bootcapm.restauranteapi.repositories;

import br.com.meli.bootcapm.restauranteapi.entities.Pedido;
import br.com.meli.bootcapm.restauranteapi.entities.Prato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PedidoRepository {
    private static Map<Integer, Pedido> pedidoMap = new HashMap<>();
    private static Integer idGlobal = 1;


    @Autowired
    private PratoRepository pratoRepository;

    public Pedido salvar(Pedido pedido) {
        pedido.setId(idGlobal);
        for(Prato p: pedido.getListaPratos()){
            pratoRepository.salvar(p);
        }
        pedidoMap.put(idGlobal++, pedido);
        return pedido;
    }

    public List<Pedido> buscarTodos () {
        List<Pedido> listaPedidos = new ArrayList<>();
        for(Pedido p: pedidoMap.values())
            listaPedidos.add(p);
        return listaPedidos;
    }

    public Pedido buscarPorId(Integer id) {
        return pedidoMap.get(id);
    }

    public void deletarPorId(Integer id){
        pedidoMap.remove(id);
    }
}
