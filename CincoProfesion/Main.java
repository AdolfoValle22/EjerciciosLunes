package CincoProfesion;

public class Main {
    public static void main(String[] args) {
        Ingeniero ingeniero = new Ingeniero("Carlos", 160, 12.5);
        Doctor doctor = new Doctor("María", 45, 25.0);

        System.out.println("Sueldo del ingeniero " + ingeniero.getNombre() + ": $" + ingeniero.calcularSueldo());
        System.out.println("Sueldo del doctor " + doctor.getNombre() + ": $" + doctor.calcularSueldo());
    }
}
