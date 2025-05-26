package TresVehiculo;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void mover() {
        System.out.println("El auto conduce por la carretera.");
    }
}