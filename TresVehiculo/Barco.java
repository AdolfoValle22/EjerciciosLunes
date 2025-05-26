package TresVehiculo;

public class Barco extends Vehiculo {

    public Barco(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El barco navega sobre el oceano.");
    }
}
