
package com.macc.model;

import com.macc.inteface.Automovil;


public class AutoElectricoFeature extends AutomovilDecorador {
    
    public AutoElectricoFeature(Automovil automovil){
        super(automovil);
    }

    @Override
    public void accelerar() {
        System.out.println("Iniciando electricamente");
        getAuto().accelerar();
    }

    @Override
    public void stop() {
        System.out.println("Controlado frenos automaticos");
        getAuto().stop();
    }

    @Override
    public void start() {
        System.out.println("Iniciando sistema operativo");
        getAuto().start();
    }
    
    
    
}
