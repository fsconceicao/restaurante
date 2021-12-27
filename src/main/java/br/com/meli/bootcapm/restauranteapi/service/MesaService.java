package br.com.meli.bootcapm.restauranteapi.service;

import br.com.meli.bootcapm.restauranteapi.entities.Mesa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MesaService {

    List<Mesa> listaMesa = new ArrayList<>();

    MesaService(){
       this.listaMesa.add(Mesa.UM);
       this.listaMesa.add(Mesa.DOIS);
       this.listaMesa.add(Mesa.TRES);
       this.listaMesa.add(Mesa.QUATRO);
       this.listaMesa.add(Mesa.CINCO);
       this.listaMesa.add(Mesa.SEIS);
       this.listaMesa.add(Mesa.SETE);
       this.listaMesa.add(Mesa.OITO);
       this.listaMesa.add(Mesa.NOVE);
       this.listaMesa.add(Mesa.DEZ);
    }

    public void mudaStatus(Mesa mesa){
        mesa.setOcupado(!mesa.isOcupado());
    }

}
