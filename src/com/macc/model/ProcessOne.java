
package com.macc.model;

//Herencia de Thead
public class ProcessOne extends Thread  {
    
    @Override
    public synchronized void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 1");
        }
    }
}
