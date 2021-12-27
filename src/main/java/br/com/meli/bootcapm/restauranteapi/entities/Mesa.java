package br.com.meli.bootcapm.restauranteapi.entities;

public enum Mesa {
    MESAUM("1"),
    MESADOIS("2");

    private String numeroMesa;

    Mesa(String numeroMesa){
        this.numeroMesa = numeroMesa;
    }

    public String getNumeroMesa(){
        return numeroMesa;
    }
}
