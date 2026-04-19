package TP1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, y;

        System.out.println("--- UBICACIÓN EN EL PLANO ---");
        System.out.print("Ingrese coordenada X (distinta a 0): ");
        x = leer.nextInt();
        System.out.print("Ingrese coordenada Y (distinta a 0): ");
        y = leer.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("El punto (" + x + "," + y + ") está en el 1º CUADRANTE.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto (" + x + "," + y + ") está en el 2º CUADRANTE.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto (" + x + "," + y + ") está en el 3º CUADRANTE.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto (" + x + "," + y + ") está en el 4º CUADRANTE.");
        } else {
            System.out.println("El punto está sobre un eje o en el origen.");
        }

        leer.close();
    }
}