import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar la matriz original de 3x3
        int[][] matriz = new int[3][3];

        // Solicitar al usuario que ingrese 9 valores numéricos
        System.out.println("Ingrese 9 valores numéricos para la matriz:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz original:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        // Mostrar la matriz transpuesta (filas y columnas invertidas)
        System.out.println("\nMatriz transpuesta:");
        for (int col = 0; col < 3; col++) {
            for (int fila = 0; fila < 3; fila++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        scanner.close(); // Cerrar el Scanner
    }
}
