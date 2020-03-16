package com.macc.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Generic {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Hola");
        
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(12);
        
        

        System.out.println(linkedList.get(1));
    }
    
}
