 
package com.macc.model;

import java.io.Serializable;


public class Student implements Serializable{
    
    private String name;
    private int age;
    private String classRoom;
    
    public Student(){
        System.out.println("Called sinde Student");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
    
    
}
