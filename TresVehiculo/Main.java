package TresVehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Auto("Toyota", "Corolla"),
            new Barco("Yamaha", "212X"),
            new Avion("Boeing", "747")
        };

        // Polimorfismo: todos llamamos mover(), pero cada clase lo implementa a su manera
        for (Vehiculo v : flota) {
            System.out.print(v.getClass().getSimpleName() + ": ");
            v.mover();
        }
    }
}