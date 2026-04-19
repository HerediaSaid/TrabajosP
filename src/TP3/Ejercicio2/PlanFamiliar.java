package TP3.Ejercicio2;

public class PlanFamiliar extends Suscripcion {

    int perfilesExtra;
    double costoPorPerfil;

    public PlanFamiliar(String email, int numeroCliente, double costoBase, int perfilesExtra, double costoPorPerfil) {
        super(email, numeroCliente, costoBase);
        this.perfilesExtra = perfilesExtra;
        this.costoPorPerfil = costoPorPerfil;
    }

    public double calcularCosto() {
        return costoBase + (perfilesExtra * costoPorPerfil);
    }
}