package com.macc.main;

import com.macc.inteface.Automovil;
import com.macc.model.AutoElectricoFeature;
import com.macc.model.CarroEstandar;


public class MainDecorador {
   
    public static void main(String[] args) {
        Automovil carro = new AutoElectricoFeature(new CarroEstandar("Chevy"));
        carro.start();
        carro.accelerar();
        carro.stop();
                
    }
}
