
package com.macc.model;


public class ProcessTwo implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 0; i <=5; i++) {
            System.out.println("Proceso 2");
        }
    }
    
}
