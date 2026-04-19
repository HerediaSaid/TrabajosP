package TP3.Ejercicio1;

import java.util.ArrayList;

public class Flota {

    ArrayList<Vehiculo> lista = new ArrayList<>();

    public void agregar(Vehiculo v) {
        lista.add(v);
    }

    public void mostrar() {
        for (Vehiculo v : lista) {
            v.mostrarInfo();
        }
    }
}