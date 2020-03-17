package com.macc.main;

import com.macc.model.ProcessOne;
import com.macc.model.ProcessTwo;

public class MainThreads {
    public static void main(String[] args) {
        
        ProcessOne threadOne =  new ProcessOne();
        Thread threadTwo = new Thread(new ProcessTwo());
        
        threadOne.start();
        threadTwo.start();
    }
}
