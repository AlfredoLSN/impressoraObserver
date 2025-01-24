package com.example;

public class ImpressoraEstadoComErro extends ImpressoraEstado{
    private ImpressoraEstadoComErro(){};
    private static ImpressoraEstadoComErro instance = new ImpressoraEstadoComErro();
    public static ImpressoraEstadoComErro getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Com erro";
    }
    @Override
    public boolean iniciar(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoIniciada.getInstance());
        return true;
    }
    @Override
    public boolean ficarPronta(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoPronta.getInstance());
        return true;
    }
    @Override
    public boolean desligar(Impressora impressora) {
        impressora.setEstado(ImpressoraEstadoDesligada.getInstance());
        return true;
    }
}
