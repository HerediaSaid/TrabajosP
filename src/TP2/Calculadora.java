package TP2;

import java.util.Scanner;

public class Calculadora {

    public double numero1;
    public double numero2;

    public Calculadora() {
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error fatal: No es posible dividir por cero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora miCalculadora = new Calculadora();

        System.out.println("--- EJECUTANDO CALCULADORA PÚBLICA ---");

        System.out.print("Ingrese el primer valor: ");
        miCalculadora.numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        miCalculadora.numero2 = entrada.nextDouble();

        System.out.println("\n> Resultados:");
        System.out.println("Suma:           " + miCalculadora.sumar(miCalculadora.numero1, miCalculadora.numero2));
        System.out.println("Resta:          " + miCalculadora.restar(miCalculadora.numero1, miCalculadora.numero2));
        System.out.println("Multiplicación: " + miCalculadora.multiplicar(miCalculadora.numero1, miCalculadora.numero2));
        System.out.println("División:       " + miCalculadora.dividir(miCalculadora.numero1, miCalculadora.numero2));

        entrada.close();
    }
}