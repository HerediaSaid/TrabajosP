package TP3.Ejercicio1;

public class Furgon extends Vehiculo {

    double carga;

    public Furgon(String marca, String modelo, double tarifaBase, double carga) {
        super(marca, modelo, tarifaBase);
        this.carga = carga;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Carga: " + carga);
        System.out.println("------");
    }
}
