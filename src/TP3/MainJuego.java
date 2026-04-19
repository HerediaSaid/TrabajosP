package TP3;

import java.util.ArrayList;
import java.util.List;

abstract class EntidadEspacial {
    protected int x, y;

    public EntidadEspacial(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void actualizarCoordenadas(int nx, int ny) {
        this.x = nx;
        this.y = ny;
    }

    public abstract void dibujar();
}

abstract class SerVivo extends EntidadEspacial {
    protected int puntosVida;
    protected String nombre;

    public SerVivo(String nombre, int x, int y, int puntosVida) {
        super(x, y);
        this.nombre = nombre;
        this.puntosVida = puntosVida;
    }

    public void recibirDano(int dano) {
        this.puntosVida -= dano;
        System.out.println(nombre + " recibió " + dano + " de daño. HP restante: " + puntosVida);
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}

abstract class PersonajeJugable extends SerVivo {
    public PersonajeJugable(String nombre, int x, int y, int puntosVida) {
        super(nombre, x, y, puntosVida);
    }
    public void interactuarConNPC() { System.out.println(nombre + " está interactuando."); }
}

abstract class MonstruoHostil extends SerVivo {
    public MonstruoHostil(String nombre, int x, int y, int puntosVida) {
        super(nombre, x, y, puntosVida);
    }
    public void buscarJugador() { System.out.println(nombre + " busca un objetivo."); }
}

interface LanzadorHechizos {
    void lanzarHechizo();
}

class GuerreroHumano extends PersonajeJugable {
    public GuerreroHumano(String nombre, int x, int y) { super(nombre, x, y, 100); }
    @Override public void dibujar() { System.out.println("Dibujando Guerrero Humano en (" + x + "," + y + ")"); }
}

class MagoElfo extends PersonajeJugable implements LanzadorHechizos {
    public MagoElfo(String nombre, int x, int y) { super(nombre, x, y, 60); }
    @Override public void dibujar() { System.out.println("Dibujando Mago Elfo en (" + x + "," + y + ")"); }
    @Override public void lanzarHechizo() { System.out.println(nombre + " lanza una bola de fuego!!"); }
}

class Orco extends MonstruoHostil {
    public Orco(String nombre, int x, int y) { super(nombre, x, y, 80); }
    @Override public void dibujar() { System.out.println("Dibujando Orco en (" + x + "," + y + ")"); }
}

class Dragon extends MonstruoHostil implements LanzadorHechizos {
    public Dragon(String nombre, int x, int y) { super(nombre, x, y, 500); }
    @Override public void dibujar() { System.out.println("Dibujando Dragón en (" + x + "," + y + ")"); }
    @Override public void lanzarHechizo() { System.out.println(nombre + " lanza un aliento de llamas malditas!!"); }
}

public class MainJuego {
    public static void main(String[] args) {
        List<EntidadEspacial> mundo = new ArrayList<>();
        mundo.add(new GuerreroHumano("Arthur", 10, 15));
        mundo.add(new MagoElfo("Legolas", 12, 15));
        mundo.add(new Orco("Grom", 20, 25));
        mundo.add(new Dragon("Smaug", 50, 50));

        System.out.println("--- Turno del Motor ---");
        for (EntidadEspacial entidad : mundo) {
            entidad.dibujar();

            if (entidad instanceof SerVivo) {
                SerVivo ser = (SerVivo) entidad;
                if (!ser.estaVivo()) {
                    System.out.println(ser.nombre + " ha sido eliminado.");
                }
            }

            if (entidad instanceof LanzadorHechizos) {
                ((LanzadorHechizos) entidad).lanzarHechizo();
            }
        }
    }
}