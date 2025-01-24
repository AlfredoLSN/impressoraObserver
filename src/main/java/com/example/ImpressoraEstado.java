package com.example;

public abstract class ImpressoraEstado {
    public abstract String getEstado();

    public boolean iniciar(Impressora impressora){
        return false;
    }
    public boolean ficarPronta(Impressora impressora){
        return false;
    }
    public boolean imprimir(Impressora impressora){
        return false;
    }
    public boolean pausar(Impressora impressora){
        return false;
    }
    public boolean gerarErro(Impressora impressora){
        return false;
    }
    public boolean desligar(Impressora impressora){
        return false;
    }
}
