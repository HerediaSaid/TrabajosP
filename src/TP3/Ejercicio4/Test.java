package TP3.Ejercicio4;

public class Test {

    public static void main(String[] args) {

        Controlador c = new Controlador();

        CamaraSeguridad cam = new CamaraSeguridad();
        TermostatoInteligente t = new TermostatoInteligente();
        SmartPhone s = new SmartPhone();

        c.agregar(cam);
        c.agregar(t);
        c.agregar(s);

        System.out.println("Conectar WiFi:");
        c.conectarDispositivos();

        System.out.println("Tomar fotos:");
        c.tomarFotos();
    }
}