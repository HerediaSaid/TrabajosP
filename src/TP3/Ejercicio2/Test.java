package TP3.Ejercicio2;

public class Test {

    public static void main(String[] args) {

        Gestor g = new Gestor();

        PlanBasico b = new PlanBasico("a@mail.com", 1, 1000);
        PlanFamiliar f = new PlanFamiliar("b@mail.com", 2, 1000, 2, 200);
        PlanPremium p = new PlanPremium("c@mail.com", 3, 1000, 500);

        g.agregar(b);
        g.agregar(f);
        g.agregar(p);

        g.mostrar();

        System.out.println("TOTAL: " + g.total());
    }
}