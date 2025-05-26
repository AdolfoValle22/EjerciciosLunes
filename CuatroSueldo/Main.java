package CuatroSueldo;

public class Main {
public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos Siguenza", 1141.0, 50.0, 10);
        empleado.registrar();
        double sueldoTotal = empleado.calcularSueldo();
        System.out.println("Su sueldo total es: $" + sueldoTotal);
    }
}
