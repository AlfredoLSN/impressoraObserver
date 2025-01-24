package com.example;

import java.util.Observable;
import java.util.Observer;

public class Computador implements Observer{
    private String computerName;
    private String lastNotification;
    
    public Computador(String computerName){
        this.computerName = computerName;
    }
    public String getLastNotification(){
        return this.lastNotification;
    }
    public void conectar(Impressora impressora){
        impressora.addObserver(this);
    }
    public void update(Observable impressora, Object arg1){
        this.lastNotification = "A impressora " +  impressora.toString();
    }
}
