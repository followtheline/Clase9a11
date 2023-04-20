/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
c
 */
package ejer6adi;

import java.util.Scanner;
public class Ejer6adi {

  
    public static void main(String[] args) {
        String[] word = new String[5];
        char[][] matrix = new char[20][20];
        fill(word, matrix);
        example(word, matrix);
        print(word, matrix);
    }

    public static void fill(String[] word, char[][] matrix) {
        for (int i = 0; i < word.length; i++) {
            System.out.println("Ingrese la palabra " + i + " de 3 a 5 caracteres");
            Scanner input = new Scanner(System.in);
            word[i] = input.next().toUpperCase();
            if (word[i].length() < 3 || word[i].length() > 5) {
                System.out.println("Debe ingresar palabras de 3 a 5 caracteres.");
            }
        }
    }

    public static void example(String[] word, char[][] matrix) {
        int[] usedRows = new int[20];

        for (String words : word) {
            int row = getUnusedRow(usedRows);
            int start = (int) (Math.random() * (20 - words.length() + 1));

            for (int i = 0; i < words.length(); i++) {
                matrix[row][start + i] = words.charAt(i);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = (char) ('0' + (int) (Math.random() * 10));
                }
            }
        }
    }

    public static void print(String[] word, char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getUnusedRow(int[] usedRows) {
        int row = (int) (Math.random() * 20);
        while (usedRows[row] != 0) {
            row = (int) (Math.random() * 20);
        }
        usedRows[row] = 1;
        return row;
    }
}