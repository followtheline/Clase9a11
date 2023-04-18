/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que 
el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 
caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada 
de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados
con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

 */
package ejer6adi;

import java.util.Scanner;
public class Ejer6adi {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String[] palabras = new String[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la palabra #" + (i+1) + " (de 3 a 5 caracteres):");
            palabras[i] = input.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres. Intente nuevamente:");
                palabras[i] = input.nextLine();
            }
        }

       
        char[][] sopa = new char[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = (char) (Math.random() * 10 + '0');
            }
        }

     
        int fila = (int) (Math.random() * 20);

     
        int columna = (int) (Math.random() * (20 - palabras.length));
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length(); j++) {
                sopa[fila][columna+j] = palabras[i].charAt(j);
            }
            columna += palabras[i].length() + 1; 
        }

       
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}