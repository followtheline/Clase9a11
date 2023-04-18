/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa 
que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o 
no. El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
cc
 */
package ejer6;

import java.util.Scanner;
public class Ejer6 {

   
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];

        // Pedir al usuario que introduzca los números del cuadrado mágico
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce un número para la posición [" + i + "][" + j + "]: ");
                cuadrado[i][j] = input.nextInt();
                
                // Comprobar que el número introducido está entre 1 y 9
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: el número introducido no está entre 1 y 9.");
                    return;
                }
            }
        }

        // Comprobar si el cuadrado mágico es válido
        int sumaFila =0, sumaColumna, sumaDiagonal1 = 0, sumaDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += cuadrado[i][j];
                sumaColumna += cuadrado[j][i];
            }
            sumaDiagonal1 += cuadrado[i][i];
            sumaDiagonal2 += cuadrado[i][2-i];
            if (sumaFila != sumaColumna) {
                System.out.println("El cuadrado no es mágico.");
                return;
            }
        }
        if (sumaDiagonal1 != sumaDiagonal2 || sumaDiagonal1 != sumaFila) {
            System.out.println("El cuadrado no es mágico.");
            return;
        }

        // Si llegamos hasta aquí, el cuadrado es mágico
        System.out.println("El cuadrado es mágico.");
    }
}