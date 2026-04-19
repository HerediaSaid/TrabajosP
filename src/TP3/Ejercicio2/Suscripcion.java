package TP3.Ejercicio2;

public abstract class Suscripcion {

    String email;
    int numeroCliente;
    double costoBase;

    public Suscripcion(String email, int numeroCliente, double costoBase) {
        this.email = email;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    // Método abstracto (cada plan lo define)
    public abstract double calcularCosto();

    public void mostrarInfo() {
        System.out.println("Email: " + email);
        System.out.println("Cliente: " + numeroCliente);
        System.out.println("Costo: " + calcularCosto());
    }
}