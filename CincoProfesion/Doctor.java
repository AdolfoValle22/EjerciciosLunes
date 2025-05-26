package cincoprofesion;

public class Doctor implements Profesion {
    private String nombre;
    private int cantidadConsultas;
    private double pagoPorConsulta;

    public Doctor() {
    }
    
    public Doctor(String nombre, int cantidadConsultas, double pagoPorConsulta) {
        this.nombre = nombre;
        this.cantidadConsultas = cantidadConsultas;
        this.pagoPorConsulta = pagoPorConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadConsultas() {
        return cantidadConsultas;
    }

    public void setCantidadConsultas(int cantidadConsultas) {
        this.cantidadConsultas = cantidadConsultas;
    }

    public double getPagoPorConsulta() {
        return pagoPorConsulta;
    }

    public void setPagoPorConsulta(double pagoPorConsulta) {
        this.pagoPorConsulta = pagoPorConsulta;
    }

    @Override
    public double calcularSueldo() {
        return cantidadConsultas * pagoPorConsulta;
    }
}
