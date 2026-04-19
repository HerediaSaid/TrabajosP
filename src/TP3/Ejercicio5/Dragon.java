package TP3.Ejercicio5;

public class Dragon extends Monstruo implements Magia {

    public Dragon(int x, int y, int vida) {
        super(x, y, vida);
    }

    public void lanzarHechizo() {
        System.out.println("Dragon lanza fuego magico");
    }
}