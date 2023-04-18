/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

 */
package ejer5adi;
import java.util.Scanner;
import java.util.Random;
public class Ejer5adi {

  
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de filas de las matrices");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Ingrese la cantidad de columnas de las matrices");
        int m=input.nextInt();
       
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        Random rand=new Random();
        System.out.println("Los elementos de la primer matriz serán generados aleatoriamente");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix1[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Los elementos de la segunda matriz serán generados aleatoriamente");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix2[i][j] = rand.nextInt(10);
            }
        }
        
       
        int[][] matrixResultado = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixResultado[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
      
        System.out.println("Matriz 1:");
        imprimirMatrix(matrix1);
        System.out.println("Matriz 2:");
        imprimirMatrix(matrix2);
        System.out.println("Matriz resultante:");
        imprimirMatrix(matrixResultado);
    }
    
    public static void imprimirMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}