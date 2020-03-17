
package com.macc.model;

import java.io.Serializable;

public class Class implements Serializable {
    
    private int noControl;
    private String name;
    private int year;
    
    public Class(){
        System.out.println("Called since Class Model");
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
