package com.example;

public class ImpressoraEstadoIniciada extends ImpressoraEstado{
    private ImpressoraEstadoIniciada(){};
    private static ImpressoraEstadoIniciada instance = new ImpressoraEstadoIniciada();
    public static ImpressoraEstadoIniciada getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Iniciada";
    }
    @Override
    public boolean ficarPronta(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        return true;
    }
    @Override
    public boolean gerarErro(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        return true;
    }
}
