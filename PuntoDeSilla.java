import java.util.Scanner;

public class PuntoDeSilla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos una matriz de 3 filas y 4 columnas
        int[][] matriz = new int[3][4];

        // Leemos 12 valores numéricos cualquiera
        System.out.println("Ingrese 12 valores numéricos para la matriz (3x4):");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Valor [" + fila + "][" + col + "]: ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        boolean existePunto = false;
        int valorPunto = 0;
        int filaPunto = -1, colPunto = -1;

        // Recorremos cada fila para buscar su mínimo
        for (int i = 0; i < 3; i++) {
            // 1) Encontrar el mínimo en la fila i
            int minFila = matriz[i][0];
            int colMin = 0;
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }
            // 2) Comprobar si ese minFila es el máximo en su columna colMin
            boolean esMaxCol = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][colMin] > minFila) {
                    esMaxCol = false;
                    break;
                }
            }
            // 3) Si cumple, ¡hemos encontrado un punto de silla!
            if (esMaxCol) {
                existePunto = true;
                valorPunto = minFila;
                filaPunto = i;
                colPunto = colMin;
                break;  // Si solo queremos uno, podemos salir aquí
            }
        }

        // Mostramos el resultado
        if (existePunto) {
            System.out.println("\nSe encontró un punto de silla:");
            System.out.println("Valor: " + valorPunto +
                               "  (fila " + filaPunto +
                               ", columna " + colPunto + ")");
        } else {
            System.out.println("\nNo existe ningún punto de silla en la matriz.");
        }

        scanner.close();
    }
}
