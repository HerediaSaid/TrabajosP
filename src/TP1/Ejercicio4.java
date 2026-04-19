package TP1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, year;

        System.out.println("--- CONSULTA DE TRIMESTRE ---");
        System.out.print("Ingrese dia: ");
        dia = leer.nextInt();
        System.out.print("Ingrese mes: ");
        mes = leer.nextInt();
        System.out.print("Ingrese año: ");
        year = leer.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " corresponde al PRIMER TRIMESTRE.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " corresponde al SEGUNDO TRIMESTRE.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " corresponde al TERCER TRIMESTRE.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " corresponde al CUARTO TRIMESTRE.");
        } else {
            System.out.println("Error: El mes ingresado no es válido.");
        }

        leer.close();
    }
}