package SeisHerencia;

public class Main {
    public static void main(String[] args) {
        Futbolista f = new Futbolista(10, "Pablo", "Mora", 26, 5, "Mediocampista");
        Entrenador e = new Entrenador(20, "Hank", "Cuadrado", 55, "FED-1234");
        Masajista m = new Masajista(30, "Mauricio", "Guerrero", 45, "Fisioterapia", 10);

        // Comportamientos heredados
        f.concentrarse();
        e.concentrarse();
        m.concentrarse();

        f.viajar();
        e.viajar();
        m.viajar();

        // Comportamientos específicos
        f.jugarPartido();
        f.entrenar();

        e.dirigirPartido();
        e.dirigirEntrenamiento();

        m.darMasaje();
    }

}
