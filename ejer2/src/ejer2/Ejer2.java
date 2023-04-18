/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le 
pida al usuario un número a buscar en el vector. El programa mostrará dónde se 
encuentra el numero y si se encuentra repetido c
 */
package ejer2;
import java.util.Random;
import java.util.Scanner;
public class Ejer2 {

   
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Ingrese la longitud del Vector");
       int n=input.nextInt();
       int vector[]= fill( n);
        show(vector, n);
        System.out.println("Ingrese el número que desea encontrar en el vector: ");
        int num=input.nextInt();
        int pos= search(vector, num);
        if (pos != -1){
            int count= counter(vector, num);
            System.out.printf("El número " +num+ " se encuentra en la posición " +pos+" del vector. ");
            if (count>1){
                System.out.printf("Se encuentra repetido "+count+" veces. ");
            }else {
            System.out.println("No se encuentra repetido");
        }
        }else{
            System.out.println("El número "+num+" no se encuentra en el vector.");
        }
        
       
    }
 public static int[] fill( int n){
      int[] vector= new int [n];
     Random rand = new Random();
     for (int i=0; i< vector.length ;i++){
         vector[i]= rand.nextInt(100);
     }
     return vector;
 } 
 public static void show(int [] vector, int num){
     String enhanced= "";
     System.out.println("El vector es: ");
     for (int print: vector){
         enhanced=enhanced+" "+print;
     }
     System.out.println(enhanced);                 
 }
 public static int search(int [] vector, int num){
     for (int i=0; i< vector.length; i++){
         if (vector[i]== num){
         return i;
     }        
     }
      return -1;
 }
 public static int counter(int [] vector, int num){
     int count =0;
             for (int i=0; i< vector.length; i++){
                 if (vector[i] == num){
                 count++;
             }
             }
             return count;
 }
}
