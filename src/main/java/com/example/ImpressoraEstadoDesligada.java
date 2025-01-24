package com.example;

public class ImpressoraEstadoDesligada extends ImpressoraEstado{
    private ImpressoraEstadoDesligada(){};
    private static ImpressoraEstadoDesligada instance = new ImpressoraEstadoDesligada();
    public static ImpressoraEstadoDesligada getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Desligada";
    }
    @Override
    public boolean iniciar(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        return true;
    }
}
