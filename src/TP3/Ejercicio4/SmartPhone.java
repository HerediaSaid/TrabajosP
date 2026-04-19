package TP3.Ejercicio4;

class SmartPhone implements TomarFoto, Wifi {

    public void tomarFoto() {
        System.out.println("Smartphone toma una foto");
    }

    public void conectarWifi() {
        System.out.println("Smartphone conectado a WiFi");
    }
}