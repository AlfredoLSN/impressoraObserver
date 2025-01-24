package com.example;

public class ImpressoraEstadoPausada extends ImpressoraEstado{
    private ImpressoraEstadoPausada(){};
    private static ImpressoraEstadoPausada instance = new ImpressoraEstadoPausada();
    public static ImpressoraEstadoPausada getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Pausada";
    }
    @Override
    public boolean imprimir(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoImprimindo.getInstance());
        return true;
    }
    @Override
    public boolean gerarErro(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoComErro.getInstance());
        return true;
    }
    @Override
    public boolean ficarPronta(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        return true;
    }
}
