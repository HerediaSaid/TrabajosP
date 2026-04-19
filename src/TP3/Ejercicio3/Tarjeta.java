package TP3.Ejercicio3;

public class Tarjeta implements Pago {

    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta por: " + monto);
    }
}