package br.com.meli.bootcapm.restauranteapi.controller;

import br.com.meli.bootcapm.restauranteapi.entities.Pedido;
import br.com.meli.bootcapm.restauranteapi.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ResponseEntity<List<Pedido>> getAll(){
        return ResponseEntity.ok(pedidoRepository.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido pedido){
        return ResponseEntity.ok(pedidoRepository.salvar(pedido));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(pedidoRepository.buscarPorId(id));
    }
}
