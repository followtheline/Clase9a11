/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario.
c
 */
package ejer1adi;
import java.util.Random;
import java.util.Scanner;
public class Ejer1adi {

   
    public static void main(String[] args) {
        System.out.println("Ingrese el valor del tamaño del vector");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []vector =new int[n];
        fill(vector, n);
        System.out.println("El vector es: ");
        show(vector, n);
        System.out.println("Ahora ingrese los valores que desea sumar al vector");
        int valores=input.nextInt();
        suma(vector, n, valores);
    }
    public static void fill(int [] vector, int n ){
        Random rand=new Random();
        for (int i= 0; i<vector.length; i++){
        vector[i]=rand.nextInt(10);
    }
    }
        public static void show(int [] vector, int n){
            for (int i=0; i<vector.length;i++){
                System.out.print(vector[i]+"\t");
        }
            System.out.println();
        }
        public static void suma(int [] vector, int n, int valores){
            for (int i=0; i<vector.length;i++){
                valores+= vector [i];
            }
            System.out.println("La suma de los valores ingresados y el vector es: "+valores);
        }
    }

