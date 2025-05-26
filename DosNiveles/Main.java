package DosNiveles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntajeTotal = 0;

        // Nivel 1: 4 preguntas
        System.out.println("=== Nivel 1 ===");
        Pregunta[] nivel1 = {
            new Pregunta("¿Capital de Francia?", "Paris"),
            new Pregunta("¿2 + 2 = ?", "4"),
            new Pregunta("¿Color del cielo en día despejado?", "Azul"),
            new Pregunta("¿Cuántos minutos tiene una hora?", "60")
        };
        puntajeTotal += jugarNivel(nivel1, sc);

        // Nivel 2: otras 4 preguntas
        System.out.println("\n=== Nivel 2 ===");
        Pregunta[] nivel2 = {
            new Pregunta("¿Lenguaje de Android nativo?", "Java"),
            new Pregunta("¿Planeta rojo?", "Marte"),
            new Pregunta("¿Masa molar del agua (H2O)?", "18"),
            new Pregunta("¿Cantidad de días en febrero (no bisiesto)?", "28")
        };
        puntajeTotal += jugarNivel(nivel2, sc);

        // Mostrar puntaje final
        System.out.println("\nPuntaje acumulado en ambos niveles: " + puntajeTotal);
        sc.close();
    }

    
    private static int jugarNivel(Pregunta[] preguntas, Scanner sc) {
        int puntajeNivel = 0;
        for (Pregunta p : preguntas) {
            System.out.println(p.getEnunciado());
            System.out.print("> ");
            String respuesta = sc.nextLine();
            if (p.esCorrecta(respuesta)) {
                System.out.println("¡Correcto! +20 puntos.");
                puntajeNivel += 20;
            } else {
                System.out.println("Incorrecto. Respuesta correcta: " 
                                   + p.getRespuestaCorrecta() + " (-10).");
                puntajeNivel -= 10;
            }
        }
        System.out.println("Puntaje de este nivel: " + puntajeNivel);
        return puntajeNivel;
    }
}