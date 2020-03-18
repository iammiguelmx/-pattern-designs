package com.macc.utl;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * *****************************************************************************
 * Nombre del Proyecto: Utl (Utilerias Generales)<BR>
 *
 * Objetivo: //TODO Describir <BR>
 *
 * @author: Miguel Angel Camacho Campos <BR>
 * e-mail : miguel.cam.mx@gmail.com <BR>
 * Fecha de Creación: 15/03/2020, 10:10:33 <BR>
 * Fecha de Ultima Modificacion:  <BR>
 *
 ******************************************************************************
 */
public class Algoritmia {

    private static final int MAX = 101;
    private static final String PATTERN = "yyyy-MM-dd";
    private static final String OS[] = {"WINDOWS", "MACOS", "LINUX", "OTHER"};
    private static final String ALPHABET[] = {"A", "B", "C", "D", "E"};
    private static final String ALGORITMO = "AES-128";

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

    static void stringRandom() {
        System.out.println(OS[new Random().nextInt(OS.length)]);
    }

    static void method() {
        System.out.println("Hello! This method dont return");
    }

    /**
     * Ordenamiento
     *
     * @param arreglo
     * @return
     */
    static int[] burbuja(int[] arreglo) {
        int auxiliar;
        int[] arregloOrdenado;
        for (int i = 2; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }

    /**
     * Tokenizer method
     *
     * @param string
     */
    static void tokenizer(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string);
        while (tokenizer.hasMoreElements()) {
            Object nextElement = tokenizer.nextElement();
            System.out.println("" + nextElement);

        }
    }

    static Object[] descifraContenido(String cadenaCifrada) {
        String json = Arrays.toString(Base64.getDecoder().decode(cadenaCifrada.getBytes()));
        return json.split(",");
    }

    /**
     * AES-128
     *
     * @param datos
     * @return
     */
    static String cifraContenido(Object[] datos) {
        String cadena = "";
        for (Object dato : datos) {
            cadena += dato + ",";
        }
        cadena = cadena.substring(0, cadena.length() - 1);
        String cadenaCifrada = Base64.getEncoder().encodeToString(cadena.getBytes());
        return cadenaCifrada;
    }

    static String getHoraActual() {
        Date date = new Date();
        return new SimpleDateFormat("HH:mm:ss").format(date);
    }

    static int mediaArray(Integer[] array) {
        int var = 0;
        for (int i = 1; i < array.length; i++) {
            // Array for save
            var += i;
        }
        return var;
    }
    
    

    /**
     * Testing here
     *
     * @param args
     */
    public static void main(String[] args) {
        

    }
}
