package TP3;

interface ProcesadorPago {
    void procesarMonto(double monto);
}

class TarjetaCredito implements ProcesadorPago {
    @Override
    public void procesarMonto(double monto) {
        System.out.println("Conectando con red Visa/Mastercard...");
        System.out.println("Validando límite disponible...");
        System.out.println("Pago de $" + monto + " procesado exitosamente con Tarjeta de Crédito.");
    }
}

class PayPal implements ProcesadorPago {
    @Override
    public void procesarMonto(double monto) {
        System.out.println("Redirigiendo a la API de PayPal...");
        System.out.println("Verificando credenciales de la cuenta...");
        System.out.println("Transferencia de $" + monto + " realizada por PayPal.");
    }
}

class Criptomoneda implements ProcesadorPago {
    @Override
    public void procesarMonto(double monto) {
        System.out.println("Generando dirección de la Wallet (BTC/ETH)...");
        System.out.println("Esperando confirmaciones en la blockchain...");
        System.out.println("Pago equivalente a $" + monto + " recibido en Criptomoneda.");
    }
}

class CarritoCompras {
    public void cobrar(ProcesadorPago metodo, double montoTotal) {
        System.out.println("Iniciando proceso de checkout...");
        metodo.procesarMonto(montoTotal);
    }
}

public class MainPagos {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        double totalCompra = 25500.50;

        // El cliente elige distintos métodos
        ProcesadorPago pago1 = new TarjetaCredito();
        carrito.cobrar(pago1, totalCompra);

        System.out.println("-------------------------");
        ProcesadorPago pago2 = new PayPal();
        carrito.cobrar(pago2, totalCompra);
    }
}