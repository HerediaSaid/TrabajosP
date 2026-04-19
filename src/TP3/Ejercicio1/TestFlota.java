package TP3.Ejercicio1;

public class TestFlota {

    public static void main(String[] args) {

        Flota flota = new Flota();

        Furgon f = new Furgon("Ford", "Transit", 10000, 1500);
        Moto m = new Moto("Honda", "XR150", 5000, 150);

        flota.agregar(f);
        flota.agregar(m);

        flota.mostrar();
    }
}