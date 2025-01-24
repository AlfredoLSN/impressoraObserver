package com.example;

public class ImpressoraEstadoImprimindo extends ImpressoraEstado{
    private ImpressoraEstadoImprimindo(){};
    private static ImpressoraEstadoImprimindo instance = new ImpressoraEstadoImprimindo();
    public static ImpressoraEstadoImprimindo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Imprimindo";
    }
    @Override
    public boolean pausar(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoPausada.getInstance());
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
