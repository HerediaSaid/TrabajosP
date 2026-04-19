package TP3;

import java.util.ArrayList;
import java.util.List;

interface Camara {
    void tomarFotografia();
}

interface ConectableWiFi {
    void conectarWiFi();
}

abstract class Dispositivo {
    protected String nombre;
    public Dispositivo(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
}

class CamaraSeguridadBasica extends Dispositivo implements Camara {
    public CamaraSeguridadBasica(String nombre) { super(nombre); }

    @Override
    public void tomarFotografia() {
        System.out.println(nombre + ": Capturando fotografía de seguridad...");
    }
}

class TermostatoInteligente extends Dispositivo implements ConectableWiFi {
    public TermostatoInteligente(String nombre) { super(nombre); }

    @Override
    public void conectarWiFi() {
        System.out.println(nombre + ": Conectando a la red WiFi del hogar...");
    }
}

class Smartphone extends Dispositivo implements Camara, ConectableWiFi {
    public Smartphone(String nombre) { super(nombre); }

    @Override
    public void tomarFotografia() {
        System.out.println(nombre + ": Tomando foto en alta resolución...");
    }

    @Override
    public void conectarWiFi() {
        System.out.println(nombre + ": Buscando redes WiFi cercanas y conectando...");
    }
}

public class MainDomotica {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new CamaraSeguridadBasica("Cámara Entrada"));
        dispositivos.add(new TermostatoInteligente("Termostato Sala"));
        dispositivos.add(new Smartphone("Mi iPhone"));

        System.out.println("--- Conectando dispositivos compatibles a la red ---");
        for (Dispositivo d : dispositivos) {
            if (d instanceof ConectableWiFi) {
                ((ConectableWiFi) d).conectarWiFi();
            }
        }

        System.out.println("\n--- Accionando cámaras ---");
        for (Dispositivo d : dispositivos) {
            if (d instanceof Camara) {
                ((Camara) d).tomarFotografia();
            }
        }
    }
}