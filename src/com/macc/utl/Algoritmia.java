package com.macc.utl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class Algoritmia {

    private static final int MAX = 101;
    private static final String PATTERN = "yyyy-MM-dd";

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
        StringBuilder builder = new StringBuilder();
        String word = builder.reverse().toString();
        System.out.println("Reverse: " + word.repeat(MAX));
        // word = builder.reverse(x);

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

    public static void main(String[] args) {


    }

}
