package TP3.Ejercicio3;

public class TestPago {

    public static void main(String[] args) {

        Carrito c = new Carrito();

        Pago t = new Tarjeta();
        Pago p = new Paypal();
        Pago cr = new Cripto();

        c.pagar(t, 1000);
        c.pagar(p, 2000);
        c.pagar(cr, 3000);
    }
}