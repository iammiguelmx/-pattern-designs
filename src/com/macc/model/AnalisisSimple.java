
package com.macc.model;

import com.macc.inteface.Estrategia;

public abstract class AnalisisSimple implements Estrategia {
    
    public void analizar(){
        iniciar();
        saltarZip();
        detener();
    }
    
    abstract void iniciar();
   
    abstract void saltarZip();
    
    abstract void detener();
    

}
