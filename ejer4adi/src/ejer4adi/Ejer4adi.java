/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 
alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno 
obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores 
necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

 */
package ejer4adi;

import java.util.Scanner;
public class Ejer4adi {

  
    public static void main(String[] args) {
   
        double[][] notas = new double[10][4]; 
        fill(notas); 
        int aprobados = aprobados(notas); 
        int desaprobados = 10 - aprobados; 
        System.out.println("Aprobados: " + aprobados); 
        System.out.println("Desaprobados: " + desaprobados);
    }
    
    public static void fill(double[][] notas) {
        Scanner input = new Scanner(System.in); 
        for (int i = 0; i < notas.length; i++) { 
            System.out.println("Alumno " + (i+1) + ":"); 
            System.out.print("Primer trabajo práctico evaluativo (10%): ");
            notas[i][0] = input.nextDouble(); 
            System.out.print("Segundo trabajo práctico evaluativo (15%): ");
            notas[i][1] = input.nextDouble();
            System.out.print("Primer integrador (25%): ");
            notas[i][2] = input.nextDouble(); 
            System.out.print("Segundo integrador (50%): ");
            notas[i][3] = input.nextDouble(); 
        }
    }
    
    public static int aprobados(double[][] notas) {
        int aprobados = 0; 
        for (int i = 0; i < notas.length; i++) { 
            double promedio = (notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5); 
            if (promedio >= 7.0) { 
                aprobados++; 
            }
        }
        return aprobados; 
    }
    
}