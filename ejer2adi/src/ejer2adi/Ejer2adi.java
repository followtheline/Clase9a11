/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación 
deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

 */
package ejer2adi;
import java.util.Random;
import java.util.Scanner;
public class Ejer2adi {

   
    public static void main(String[] args) {
        System.out.println("Ingrese los valores de tamaño de los vectores:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] vector=new int [n];
        int [] vector2=new int [n];
        fill(vector, vector2, n);
        show(vector, vector2, n);
      if (same(vector, vector2, n)){
          System.out.println("Los vectores son iguales");
      }else {
          System.out.println("Los vectores no son iguales");
      }
    }
    public static void fill(int [] vector, int [] vector2, int n) {
    Random rand= new Random();
    for (int i=0; i<vector.length; i++){
        vector[i]=rand.nextInt(10);
    }
    for (int i=0; i<vector2.length; i++){
        vector2[i]=rand.nextInt(10);
    }
}
    public static void show(int [] vector, int [] vector2, int n){
        System.out.println("Vector 1=");
        for (int i=0; i<vector.length;i++){
            System.out.print(vector[i]+"\t");
        }
        System.out.println();
        System.out.println("Vector 2="); 
        for (int i=0; i<vector2.length;i++){
            System.out.print(vector2[i]+"\t");
        }
        System.out.println();
    }
    public static boolean same(int [] vector, int [] vector2, int n){
       
        for (int i=0; i<vector.length;i++){
            if (vector[i]!=vector2[i]){
             return false;   
            }
        }
        return true;
    }
    
}
