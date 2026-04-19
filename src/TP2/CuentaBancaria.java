package TP2;

public class CuentaBancaria {
    public String titular;
    public double saldo;

    public CuentaBancaria(String nombre, double inicial) {
        this.titular = nombre;
        this.saldo = inicial;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Depositado: " + monto);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Retirado: " + monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Tu Nombre", 1000.0);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
