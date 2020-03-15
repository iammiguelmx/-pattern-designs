package com.macc.main;

import com.macc.model.Logger;


public class MainSingleton {
    
    public static void main(String[] args) {
        
        Logger loggerOne =  Logger.getIntance();
        Logger loggerTwo =  Logger.getIntance();
        
        loggerOne.setValue("mensaje");
        System.out.println(loggerTwo.getvalue());
        
        
        
    }
}
