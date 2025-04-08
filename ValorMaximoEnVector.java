import java.util.Scanner;

public class ValorMaximoEnVector {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int maximo = Integer.MIN_VALUE;
        int posicion = -1;

        // Pedir al usuario que ingrese los 8 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verificar si es el nuevo máximo
            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicion = i;
            }
        }

        // Mostrar el número mayor y su posición
        System.out.println("El número mayor es: " + maximo);
        System.out.println("Se encuentra en la posición: " + posicion);

        scanner.close();
    }
}
