/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejer3;

import java.util.Scanner;

import java.util.Random;
public class Ejer3 {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de elementos del vector: ");
    int n = input.nextInt();
    
    
    int[] vector = new int[n];
    Random rand = new Random();
    for (int i = 0; i < vector.length; i++) {
        vector[i] = rand.nextInt(99999);
    }
    
    int[] counters = new int[5];
    for (int i = 0; i < vector.length; i++) {
        int digits = String.valueOf(vector[i]).length();
        if (digits >= 1 && digits <= 5) {
            counters[digits-1]++;
        }
    }
    
    for (int i = 0; i < counters.length; i++) {
        System.out.println("Cantidad de numeros con " + (i+1) + " digitos: " + counters[i]);
    }
    }}