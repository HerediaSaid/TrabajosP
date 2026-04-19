package TP3.Ejercicio1;

public class Moto extends Vehiculo {

    int cilindrada;

    public Moto(String marca, String modelo, double tarifaBase, int cilindrada) {
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("------");
    }
}