package TP3;

import java.util.ArrayList;
import java.util.List;

abstract class Suscripcion {
    protected String correoElectronico;
    protected int numeroCliente;
    protected double costoBase;

    public Suscripcion(String correoElectronico, int numeroCliente, double costoBase) {
        this.correoElectronico = correoElectronico;
        this.numeroCliente = numeroCliente;
        this.costoBase = costoBase;
    }

    public abstract double calcularCostoMensual();
}

class PlanBasico extends Suscripcion {
    public PlanBasico(String correo, int nroCliente, double costoBase) {
        super(correo, nroCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase;
    }
}

class PlanFamiliar extends Suscripcion {
    private int perfilesAdicionales;
    private double recargoPorPerfil;

    public PlanFamiliar(String correo, int nroCliente, double costoBase, int perfilesAdicionales, double recargoPorPerfil) {
        super(correo, nroCliente, costoBase);
        this.perfilesAdicionales = perfilesAdicionales;
        this.recargoPorPerfil = recargoPorPerfil;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + (perfilesAdicionales * recargoPorPerfil);
    }
}

class PlanPremium extends Suscripcion {
    private double cargoFijoExtra;

    public PlanPremium(String correo, int nroCliente, double costoBase, double cargoFijoExtra) {
        super(correo, nroCliente, costoBase);
        this.cargoFijoExtra = cargoFijoExtra;
    }

    @Override
    public double calcularCostoMensual() {
        return costoBase + cargoFijoExtra;
    }
}

public class MainSuscripciones {
    public static void main(String[] args) {
        List<Suscripcion> suscripciones = new ArrayList<>();
        suscripciones.add(new PlanBasico("user1@mail.com", 101, 5000));
        suscripciones.add(new PlanFamiliar("user2@mail.com", 102, 5000, 3, 1000));
        suscripciones.add(new PlanPremium("user3@mail.com", 103, 5000, 3500));

        double gananciasTotales = 0;
        for (Suscripcion sub : suscripciones) {
            double costo = sub.calcularCostoMensual();
            System.out.println("Cliente #" + sub.numeroCliente + " abona: $" + costo);
            gananciasTotales += costo;
        }
        System.out.println("Ganancias Totales de la Empresa: $" + gananciasTotales);
    }
}