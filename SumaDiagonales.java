import java.util.Scanner;


public class SumaDiagonales {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar el tamaño de la matriz
        do {
            System.out.print("Ingresa el tamaño de la matriz (n ≤ 5): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 5);

        int[][] matriz = new int[n][n];
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

        // Llenar la matriz con valores ingresados por el usuario
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular suma de las diagonales
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];           // Diagonal principal
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];   // Diagonal secundaria
        }

        // Mostrar resultados
        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);

        scanner.close();
    }
}
