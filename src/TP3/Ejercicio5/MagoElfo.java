package TP3.Ejercicio5;

public class MagoElfo extends Personaje implements Magia {

    public MagoElfo(int x, int y, int vida) {
        super(x, y, vida);
    }

    public void lanzarHechizo() {
        System.out.println("Mago elfo lanza hechizo");
    }
}