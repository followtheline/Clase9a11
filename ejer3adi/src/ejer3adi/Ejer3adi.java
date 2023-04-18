/*
 Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
c
 */
package ejer3adi;

import java.util.Random;
public class Ejer3adi {

   
    public static void main(String[] args) {
        int [] vector=new int [5];
        fill(vector);
        show(vector);
    }
    public static void fill(int [] vector){
        Random rand= new Random ();
        for (int i=0; i<vector.length;i++){
            vector[i]=rand.nextInt(10);
        }
    }
    public static void show(int [] vector){
        for (int i=0; i<vector.length;i++){
            System.out.print(vector[i]+"\t");
        }
        System.out.println();
    }
}
