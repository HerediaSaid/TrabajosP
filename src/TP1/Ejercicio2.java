package TP1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double n1, n2, n3, promedio;

        System.out.println("--- SISTEMA DE PROMOCIÓN ---");

        System.out.print("Nota 1: ");
        n1 = leer.nextDouble();

        System.out.print("Nota 2: ");
        n2 = leer.nextDouble();

        System.out.print("Nota 3: ");
        n3 = leer.nextDouble();

        promedio = (n1 + n2 + n3) / 3;
        System.out.println("Promedio final: " + promedio);

        if (promedio >= 8) {
            System.out.println("ESTADO: PROMOCIONADO");
        } else {
            System.out.println("ESTADO: NO PROMOCIONA");
        }

        leer.close();
    }
}