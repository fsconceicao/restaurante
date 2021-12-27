package br.com.meli.bootcapm.restauranteapi.service;

import br.com.meli.bootcapm.restauranteapi.entities.Mesa;
import br.com.meli.bootcapm.restauranteapi.entities.Pedido;
import br.com.meli.bootcapm.restauranteapi.entities.Prato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {


    @Autowired
    PratoService pratoService;


    public void registraPedido(Mesa mesa, List<Prato> pratos){

        if(mesa.isOcupado()){

        }else {
            mesa.setOcupado(true);
        }

    }

    public Double calculaTotal(Pedido pedido){

        Double total = 0.0;

        for(Prato p : pedido.getListaPratos()){
            total+= p.getPreco() * p.getQuantidade();
        }

        return total;
    }

    public void encerramento (Pedido pedido){
        Double total = calculaTotal(pedido);
        pedido.getMesa().setOcupado(false);
    }

}
