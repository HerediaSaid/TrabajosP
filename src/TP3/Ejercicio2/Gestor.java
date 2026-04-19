package TP3.Ejercicio2;

import java.util.ArrayList;

public class Gestor {

    ArrayList<Suscripcion> lista = new ArrayList<>();

    public void agregar(Suscripcion s) {
        lista.add(s);
    }

    public void mostrar() {
        for (Suscripcion s : lista) {
            s.mostrarInfo();
            System.out.println("------");
        }
    }

    public double total() {
        double suma = 0;

        for (Suscripcion s : lista) {
            suma = suma + s.calcularCosto();
        }

        return suma;
    }
}