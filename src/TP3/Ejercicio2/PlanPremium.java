package TP3.Ejercicio2;

public class PlanPremium extends Suscripcion {

    double extra;

    public PlanPremium(String email, int numeroCliente, double costoBase, double extra) {
        super(email, numeroCliente, costoBase);
        this.extra = extra;
    }

    public double calcularCosto() {
        return costoBase + extra;
    }
}