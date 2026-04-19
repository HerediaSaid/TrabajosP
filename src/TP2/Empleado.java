package TP2;

public class Empleado {

    private final int legajo;
    private final String nombre;
    private double salario;

    private static int contadorEmpleados = 0;


    public Empleado(int legajo, String nombre, double salarioInicial) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.salario = salarioInicial;
        contadorEmpleados++;
    }

    public void aumentarSalario(double porcentaje, String motivo) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
        System.out.println("Aumento (%) para " + nombre + ": " + motivo);
    }

    public void aumentarSalario(String motivo, double montoFijo) {
        this.salario += montoFijo;
        System.out.println("Aumento (Fijo) para " + nombre + ": " + motivo);
    }


    public static int getTotalEmpleados() {
        return contadorEmpleados;
    }

    public void mostrarDatos() {
        System.out.println("[" + legajo + "] " + nombre + " - Salario actual: $" + salario);
    }

    public static void main(String[] args) {

        Empleado emp1 = new Empleado(101, "Lucas Atrib", 50000);
        Empleado emp2 = new Empleado(102, "Said Heredia", 60000);


        emp1.aumentarSalario(10.5, "Excelente desempeño anual");
        emp2.aumentarSalario("Ajuste por inflación", 5000);

        System.out.println("-----------------------------------");
        emp1.mostrarDatos();
        emp2.mostrarDatos();


        System.out.println("-----------------------------------");
        System.out.println("Cantidad total de empleados: " + Empleado.getTotalEmpleados());
    }
}