package TP2;

public class Libro {

    private final String nombreLibro;
    private final String escritor;
    private final String codigoISBN;
    private String situacion; // "Disponible" o "Prestado"


    public Libro(String titulo, String autor, String isbn) {
        this.nombreLibro = titulo;
        this.escritor = autor;
        this.codigoISBN = isbn;
        this.situacion = "Disponible";
    }

    public void prestar() {
        if (situacion.equals("Disponible")) {
            situacion = "Prestado";
            System.out.println(">>> Confirmado: Has retirado el libro.");
        } else {
            System.out.println(">>> Aviso: El libro no se encuentra aquí actualmente.");
        }
    }

    public void devolver() {
        situacion = "Disponible";
        System.out.println(">>> Confirmado: El libro ha sido devuelto.");
    }

    public void mostrarInformacion() {
        System.out.println("======== BIBLIOTECA ========");
        System.out.println("Libro:  " + nombreLibro);
        System.out.println("Autor:  " + escritor);
        System.out.println("ISBN:   " + codigoISBN);
        System.out.println("Estado: " + situacion);
        System.out.println("============================");
    }

    public static void main(String[] args) {

        Libro miLibro = new Libro("Shrek", "Roberto Said Heredis", "978-0345339683");

        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.mostrarInformacion();
        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}