/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa).
c
 */
package ejer4;
import java.util.Random;
public class Ejer4 {

   
    public static void main(String[] args) {
       int[][] matrix =new int [4][4];
        fill(matrix);
        System.out.println("La matriz es: ");
        print(matrix);
        System.out.println("Su matríz traspuesta es: ");
        transpose(matrix);
    }
    public static void fill(int [][] matrix){
        Random rand = new Random();
        for (int i= 0; i<matrix.length; i++){
            for (int j= 0; j< matrix[i].length;j++){              
            
           matrix[i][j]=rand.nextInt(100);
            }
        }
    } 
    public static void print(int [][] matrix){
        for (int i=0; i<matrix.length;i++){
            for (int j=0 ; j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+"\t");                        
            }
            System.out.println();
        }
    }
    public static void transpose(int [][] matrix){
        for (int j=0; j<matrix.length;j++){
            for (int i=0 ; i< matrix[j].length;i++){
                System.out.print(matrix[i][j]+"\t");                        
            }
            System.out.println();
        }
    }
           
}
