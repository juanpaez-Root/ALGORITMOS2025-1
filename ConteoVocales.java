import java.util.Scanner;

public class ConteoVocales {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];
        int contadorVocales = 0;

        // Pedir al usuario que ingrese 10 caracteres
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Ingresa el carácter " + (i + 1) + ": ");
            String entrada = scanner.next();
            caracteres[i] = entrada.charAt(0);

            // Convertir a minúscula para facilitar comparación
            char c = Character.toLowerCase(caracteres[i]);

            // Verificar si es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        // Mostrar resultado
        System.out.println("Cantidad de vocales ingresadas: " + contadorVocales);

        scanner.close();
    }
}
