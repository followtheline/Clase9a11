/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
c
 */
package ejer5;
import java.util.Random;
import java.util.Scanner;
public class Ejer5 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño de la Matríz");
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int [][] matrix= new int[n][n];
        fill(matrix);
        System.out.println("La matríz es: ");
        print(matrix);
        System.out.println("Su traspuesta es: ");
        transpose(matrix);
        if (antisimetrica(matrix)){
            System.out.println("La matríz es antisimétrica");
        }else{
            System.out.println("La matríz no es antisimétrica");
        }
    }
    public static void fill(int [][] matrix){
        Random rand=new Random();
        for (int i=0; i< matrix.length;i++){
            for (int j=0; j< matrix.length;j++){
                matrix [i][j]= rand.nextInt(99);
            }
        }
    }
    public static void print(int [][] matrix){
        for (int i= 0; i< matrix.length;i++){
            for (int j=0; j< matrix.length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void transpose(int [][] matrix){
        for (int j=0; j<matrix.length; j++){
            for (int i=0; i<matrix.length;i++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static boolean antisimetrica(int [][] matrix){
        for (int i= 0; i< matrix.length;i++){
            for (int j=0; j< matrix.length;j++){
               if (matrix[i][j] != -matrix [j][i]) {
                   return false;
               } 
            }
        }
        return true;
    }
}
