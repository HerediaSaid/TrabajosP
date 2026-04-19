package TP3.Ejercicio5;

public class EntidadEspacial {

    int x;
    int y;

    public EntidadEspacial(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int nx, int ny) {
        x = nx;
        y = ny;
    }

    public void dibujar() {
        System.out.println("Dibujando en: " + x + ", " + y);
    }
}