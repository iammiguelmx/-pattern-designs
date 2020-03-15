
package com.macc.model;

import com.macc.inteface.Automovil;


public class CarroEstandar implements Automovil {

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
