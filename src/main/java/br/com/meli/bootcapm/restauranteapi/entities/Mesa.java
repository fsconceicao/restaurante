package br.com.meli.bootcapm.restauranteapi.entities;


public enum Mesa {

    UM("1"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10");

    private boolean isOcupado;
    private String numeroMesa;

    Mesa(String numeroMesa){
        this.numeroMesa = numeroMesa;
        this.isOcupado=false;
    }

    public String getNumeroMesa(){
        return numeroMesa;
    }

    public boolean isOcupado() {
        return isOcupado;
    }

    public void setOcupado(boolean ocupado) {
        isOcupado = ocupado;
    }
}
