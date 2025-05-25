import java.util.Scanner;

public class FrutasInversas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos un arreglo (vector) para almacenar 10 nombres de frutas
        String[] frutas = new String[10];

        // Ciclo para llenar el arreglo con los nombres de frutas
        System.out.println("Ingrese los nombres de 10 frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostramos las frutas en orden inverso
        System.out.println("\nFrutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        scanner.close();
    }
}
