import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos un arreglo de 12 enteros llamado "numeros"
        int[] numeros = new int[12];

        // Variables para contar los números pares e impares
        int pares = 0;
        int impares = 0;

        // Solicitamos al usuario que ingrese los 12 números
        System.out.println("Ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Guardamos el número ingresado

            // Verificamos si es par o impar usando el operador %
            if (numeros[i] % 2 == 0) {
                pares++; // Aumentamos el contador de pares
            } else {
                impares++; // Aumentamos el contador de impares
            }
        }

        // Mostramos el resultado
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close(); // Cerramos el Scanner
    }
}

