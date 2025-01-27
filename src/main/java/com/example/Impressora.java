package com.example;

import java.util.Observable;

public class Impressora extends Observable{
    private ImpressoraEstado estado;
    private String impressoraNome;
    
    public Impressora(String impressoraNome){
        this.impressoraNome = impressoraNome;
        this.estado = ImpressoraEstadoIniciada.getInstance();
    }
    public String getImpressoraNome(){
        return this.impressoraNome;
    }
    @Override
    public String toString() {
        return impressoraNome;
    }
    public void setEstado(ImpressoraEstado estado){
        this.estado = estado;
    }
    public boolean iniciar(){
        return estado.iniciar(this);
    }
    public boolean ficarPronta(){
        setChanged();
        notifyObservers();
        return estado.ficarPronta(this);
    }
    public boolean imprimir(){
        return estado.imprimir(this);
    }
    public boolean pausar(){
        return estado.pausar(this);
    }
    public boolean gerarErro(){
        return estado.gerarErro(this);
    }
    public boolean desligar(){
        return estado.desligar(this);
    }
    public ImpressoraEstado getEstado(){
        return estado;
    }
}
