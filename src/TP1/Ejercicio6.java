package TP1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, equilatero = 0, isosceles = 0, escaleno = 0;

        System.out.print("¿Cuántos triángulos va a ingresar?: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Triángulo " + i + ":");
            System.out.print("Lado 1: ");
            int l1 = leer.nextInt();
            System.out.print("Lado 2: ");
            int l2 = leer.nextInt();
            System.out.print("Lado 3: ");
            int l3 = leer.nextInt();

            if (l1 == l2 && l2 == l3) {
                System.out.println("Es Equilátero.");
                equilatero++;
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Es Isósceles.");
                isosceles++;
            } else {
                System.out.println("Es Escaleno.");
                escaleno++;
            }
        }

        System.out.println("\n--- RESULTADOS TOTALES ---");
        System.out.println("Equiláteros: " + equilatero);
        System.out.println("Isósceles: " + isosceles);
        System.out.println("Escalenos: " + escaleno);


        if (equilatero < isosceles && equilatero < escaleno) {
            System.out.println("El tipo con menor cantidad es: Equilátero");
        } else if (isosceles < escaleno) {
            System.out.println("El tipo con menor cantidad es: Isósceles");
        } else {
            System.out.println("El tipo con menor cantidad es: Escaleno");
        }

        leer.close();
    }
}