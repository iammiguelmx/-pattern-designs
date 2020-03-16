package com.macc.model;

public class Generic<T> {
    
    private T dato;

    public Generic(){

    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
   
}