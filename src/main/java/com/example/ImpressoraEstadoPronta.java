package com.example;

public class ImpressoraEstadoPronta extends ImpressoraEstado{
    private ImpressoraEstadoPronta(){};
    private static ImpressoraEstadoPronta instance = new ImpressoraEstadoPronta();
    public static ImpressoraEstadoPronta getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Pronta";
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
    public boolean desligar(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        return true;
    }
}
