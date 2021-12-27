package br.com.meli.bootcapm.restauranteapi.service;

import br.com.meli.bootcapm.restauranteapi.entities.Prato;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PratoService {

    Prato prato = new Prato();

    public void salvarPrato(Prato prato){

    }

    public Prato consultarPrato(Prato prato){


        return prato;
    }

    public List<Prato> listar(){
        return null;
    }

}
