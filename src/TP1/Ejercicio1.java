package TP1;

import java.util.Scanner;

public class
Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;

        System.out.println("--- SISTEMA DE CALIFICACIONES ---");
        System.out.print("Ingrese la nota del alumno: ");

        if (leer.hasNextInt()) {
            nota = leer.nextInt();

            if (nota < 1 || nota > 10) {
                System.out.println("Error: La nota debe estar entre 1 y 10.");
            } else {
                verificarCondicion(nota);
            }
        } else {
            System.out.println("Error: No ingresaste un número válido.");
        }

        leer.close();
    }

    public static void verificarCondicion(int nota) {
        if (nota >= 4) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El alumno está desaprobado.");
        }
    }
} // Se cierra la clase Ejercicio1