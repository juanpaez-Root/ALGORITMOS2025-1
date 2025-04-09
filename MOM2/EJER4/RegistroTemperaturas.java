import java.util.Scanner;

public class RegistroTemperaturas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;
        boolean alertaFiebre = false;

        // Solicitar las temperaturas al usuario
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingresa la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            suma += temperaturas[i];
            if (temperaturas[i] > 38) {
                alertaFiebre = true;
            }
        }

        // Calcular promedio
        double promedio = suma / 7;
        System.out.printf("Promedio de temperatura: %.2f°C%n", promedio);

        // Verificar alerta de fiebre
        if (alertaFiebre) {
            System.out.println("Alerta de fiebre: ¡una o más temperaturas superan los 38°C!");
        } else {
            System.out.println("No se detectaron temperaturas superiores a 38°C.");
        }

        scanner.close();
    }
}
