package TP1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("--- CONTADOR DE DÍGITOS ---");
        System.out.print("Ingrese un número positivo (1-99): ");
        num = leer.nextInt();

        if (num >= 1 && num <= 9) {
            System.out.println("El número tiene un solo dígito.");
        }

        else if (num >= 10 && num <= 99) {
            System.out.println("El número tiene dos dígitos.");
        }
        else {
            System.out.println("Error: El número no está en el rango de 1 a 99.");
        }

        leer.close();
    }
}