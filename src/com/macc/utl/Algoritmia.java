package com.macc.utl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class Algoritmia {

    private static final int MAX = 101;
    private static final String PATTERN = "yyyy-MM-dd";
    private static final String OS[] = {"WINDOWS","MACOS","LINUX","OTHER"};
    private static final String  ALPHABET[] = {"A","B","C","D","E"};

    /**
     *
     * @param x
     * @return true = is Par
     * @return false = no is par
     */
    static boolean isPar(int x) {
        return x % 2 == 0;
    }

    /**
     * @return number 0 to 100 random
     */
    static int getNumberRandom() {
        Random random = new Random();
        return random.nextInt(MAX);
    }

    /**
     * return tbl 0 to 10;
     */
    static void getTbl() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + "=" + i * j);
            }
        }
    }

    static void reverse(String x) {
        StringBuilder sb = new StringBuilder(x);
        System.out.println(sb.reverse().toString());

    }

    /**
     * Add in a LinkedList Student
     *
     * @param Student
     * @return
     */
    static void addStudents(LinkedList Student) {
        LinkedList add = new LinkedList();
        add.add(Student);
    }

    static void getDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }

    static double factorial(int n) {
        double fact = 1;
        int i;
        if (n == 0) {
            fact = 1;
        } else {
            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    /**
     * Fib with switch case for better performance
     *
     * @param x
     * @return
     */
    static int fib(int x) {
        switch (x) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fib(x - 1) + fib(x - 2);
        }
    }

    /**
     * New in java 13
     *
     * @param x
     * @return
     */
    static boolean isLegar(int x) {
        return x >= 18;
    }

    /**
     * Return a array.
     *
     * @return
     */
    static int[] numbers() {
        int[] arr = {5, 6, 7, 8, 9};  //initializing array  
        return arr;
    }
    
    static void stringRandom(){
        System.out.println(OS[new Random().nextInt(OS.length)]);
    }
    
    static void method(){
        System.out.println("Hello! This method dont return");
    }

    public static void main(String[] args) {
        
    }
    

}
