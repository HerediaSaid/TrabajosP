package TP3.Ejercicio5;

public class Test {

    public static void main(String[] args) {

        Motor m = new Motor();

        GuerreroHumano g = new GuerreroHumano(0, 0, 100);
        MagoElfo me = new MagoElfo(1, 1, 80);
        Orco o = new Orco(2, 2, 120);
        Dragon d = new Dragon(3, 3, 300);

        m.agregar(g);
        m.agregar(me);
        m.agregar(o);
        m.agregar(d);

        m.dibujarTodo();
        m.moverTodo();
        m.mostrarVida();
        m.usarMagia();
    }
}