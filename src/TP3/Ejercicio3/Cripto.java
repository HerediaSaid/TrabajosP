package TP3.Ejercicio3;

public class Cripto implements Pago {

    public void procesarPago(double monto) {
        System.out.println("Pago con Criptomoneda por: " + monto);
    }
}