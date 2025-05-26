package TresVehiculo;

public class Avion extends Vehiculo {
    public Avion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mover() {
        System.out.println("El avión vuela por los cielos.");
    }

}
