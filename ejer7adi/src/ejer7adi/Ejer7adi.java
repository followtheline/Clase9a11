/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como 
parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
c
 */
package ejer7adi;

import java.util.Scanner;
public class Ejer7adi {

  
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci a generar: ");
        int n = input.nextInt();
        int[] fib = new int[n];
        generateFibonacci(fib, n);
        System.out.println("La sucesión de Fibonacci de " + n + " números es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }

    public static void generateFibonacci(int[] fib, int n) {
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }
}