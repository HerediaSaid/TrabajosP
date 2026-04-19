package TP3.Ejercicio3;

public class Carrito {

    public void pagar(Pago metodo, double monto) {
        metodo.procesarPago(monto);
    }
}