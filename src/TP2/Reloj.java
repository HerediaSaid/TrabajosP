package TP2;

public class Reloj {
    // Atributos privados (Encapsulamiento)
    private int hora, minuto, segundo;


    public void establecerHora(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }


    public void mostrarHora() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void avanzarSegundo() {
        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
        }

        if (minuto == 60) {
            minuto = 0;
            hora++;
        }

        if (hora == 24) {
            hora = 0;
        }
    }

    public static void main(String[] args) {
        Reloj miReloj = new Reloj();


        miReloj.establecerHora(12, 30, 59);

        System.out.print("Hora inicial: ");
        miReloj.mostrarHora();


        miReloj.avanzarSegundo();
        System.out.print("Un segundo después: ");
        miReloj.mostrarHora();
    }
}