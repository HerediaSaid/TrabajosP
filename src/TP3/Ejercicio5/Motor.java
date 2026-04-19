package TP3.Ejercicio5;

import java.util.ArrayList;

public class Motor {

    ArrayList<EntidadEspacial> lista = new ArrayList<>();

    public void agregar(EntidadEspacial e) {
        lista.add(e);
    }

    public void dibujarTodo() {
        for (EntidadEspacial e : lista) {
            e.dibujar();
        }
    }

    public void moverTodo() {
        for (EntidadEspacial e : lista) {
            e.mover(10, 10);
        }
    }

    public void mostrarVida() {
        for (EntidadEspacial e : lista) {
            if (e instanceof SerVivo) {
                SerVivo s = (SerVivo) e;
                System.out.println("Vida: " + s.estaVivo());
            }
        }
    }

    public void usarMagia() {
        for (EntidadEspacial e : lista) {
            if (e instanceof Magia) {
                ((Magia) e).lanzarHechizo();
            }
        }
    }
}