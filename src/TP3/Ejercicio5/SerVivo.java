package TP3.Ejercicio5;

public class SerVivo extends EntidadEspacial {

    int vida;

    public SerVivo(int x, int y, int vida) {
        super(x, y);
        this.vida = vida;
    }

    public void recibirDanio(int d) {
        vida = vida - d;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}