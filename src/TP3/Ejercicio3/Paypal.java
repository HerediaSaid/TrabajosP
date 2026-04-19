package TP3.Ejercicio3;

public class Paypal implements Pago {

    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal por: " + monto);
    }
}