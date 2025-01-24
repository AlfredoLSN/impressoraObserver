package com.example;

public class Impressora {
    private ImpressoraEstado estado;
    
    public Impressora(){
        this.estado = ImpressoraEstadoIniciada.getInstance();
    }
    public void setEstado(ImpressoraEstado estado){
        this.estado = estado;
    }
    public boolean iniciar(){
        return estado.iniciar(this);
    }
    public boolean ficarPronta(){
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
