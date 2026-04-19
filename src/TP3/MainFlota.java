package TP3;

import java.util.ArrayList;
import java.util.List;

class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double tarifaBase;

    public Vehiculo(String marca, String modelo, double tarifaBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
    }

    public void imprimirInformacion() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Tarifa Base: $" + tarifaBase);
    }
}

class Furgoneta extends Vehiculo {
    private double capacidadCargaKg;

    public Furgoneta(String marca, String modelo, double tarifaBase, double capacidadCargaKg) {
        super(marca, modelo, tarifaBase);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Furgoneta: " + marca + " " + modelo + " | Tarifa Base: $" + tarifaBase + " | Capacidad de Carga: " + capacidadCargaKg + " kg");
    }
}

class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double tarifaBase, int cilindrada) {
        super(marca, modelo, tarifaBase);
        this.cilindrada = cilindrada;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Motocicleta: " + marca + " " + modelo + " | Tarifa Base: $" + tarifaBase + " | Cilindrada: " + cilindrada + " cc");
    }
}

public class MainFlota {
    public static void main(String[] args) {
        List<Vehiculo> flota = new ArrayList<>();
        flota.add(new Furgoneta("Mercedes-Benz", "Sprinter", 50000, 1500));
        flota.add(new Motocicleta("Honda", "CG 150", 15000, 150));
        flota.add(new Furgoneta("Renault", "Kangoo", 35000, 800));

        System.out.println("--- Reporte de Flota ---");
        for (Vehiculo vehiculo : flota) {
            vehiculo.imprimirInformacion();
        }
    }
}