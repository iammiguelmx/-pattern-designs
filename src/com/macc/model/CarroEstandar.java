
package com.macc.model;

import com.macc.inteface.Automovil;


public class CarroEstandar implements Automovil {
    
    private String nombre;
    
    public CarroEstandar(String s){
        nombre = s;
    }

    @Override
    public void accelerar() {
        System.out.println("Accelerar");
    }

    @Override
    public void stop() {
        System.out.println("Frenar");
    }

    @Override
    public void start() {
        System.out.println("Encender");
    }
}
