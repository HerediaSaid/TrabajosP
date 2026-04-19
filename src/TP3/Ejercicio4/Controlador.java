package TP3.Ejercicio4;

import java.util.ArrayList;

public class Controlador {

    ArrayList<Object> dispositivos = new ArrayList<>();

    public void agregar(Object d) {
        dispositivos.add(d);
    }

    public void conectarDispositivos() {
        for (Object d : dispositivos) {
            if (d instanceof Wifi) {
                ((Wifi) d).conectarWifi();
            }
        }
    }

    public void tomarFotos() {
        for (Object d : dispositivos) {
            if (d instanceof TomarFoto) {
                ((TomarFoto) d).tomarFoto();
            }
        }
    }
}