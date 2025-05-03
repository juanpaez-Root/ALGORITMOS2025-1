import java.util.Scanner;

public class RegistroDeTemperaturas {
    public static void main(String[] args) {
        final int DIAS = 30;
        double[] temperaturas = new double[DIAS];
        Scanner scanner = new Scanner(System.in);

        // También usaremos una matriz para practicar: [30][2] -> [día][temperatura, indicador de día cálido]
        double[][] datosTemperatura = new double[DIAS][2];

        // --- Ciclo do-while para ingresar las temperaturas
        int dia = 0;
        do {
            System.out.print("Ingrese la temperatura máxima del día " + (dia + 1) + ": ");
            temperaturas[dia] = scanner.nextDouble();
            datosTemperatura[dia][0] = temperaturas[dia]; // Guardamos en matriz
            dia++;
        } while (dia < DIAS);

        double max = temperaturas[0];
        double min = temperaturas[0];
        double suma = 0;
        int diasCalidos = 0;
        int i = 0;

        // --- Ciclo while para procesar los datos
        while (i < DIAS) {
            double temp = temperaturas[i];
            if (temp > max) max = temp;
            if (temp < min) min = temp;

            suma += temp;

            // if-else para marcar día como cálido
            if (temp > 25) {
                datosTemperatura[i][1] = 1; // 1 indica día cálido
                diasCalidos++;
            } else {
                datosTemperatura[i][1] = 0;
            }

            i++;
        }

        double promedio = suma / DIAS;

        // --- Mostrar resultados con switch-case
        System.out.println("\n--- Menú de Resultados ---");
        int opcion = 1;
        do {
            System.out.println("\n1. Temperatura Máxima");
            System.out.println("2. Temperatura Mínima");
            System.out.println("3. Promedio del mes");
            System.out.println("4. Número de días con temperatura > 25°C");
            System.out.println("5. Ver días cálidos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Temperatura máxima: " + max + " °C");
                    break;
                case 2:
                    System.out.println("Temperatura mínima: " + min + " °C");
                    break;
                case 3:
                    System.out.println("Temperatura promedio: " + promedio + " °C");
                    break;
                case 4:
                    System.out.println("Días con temperatura > 25 °C: " + diasCalidos);
                    break;
                case 5:
                    System.out.println("Días cálidos:");
                    for (int j = 0; j < DIAS; j++) {
                        if (datosTemperatura[j][1] == 1) {
                            System.out.println("Día " + (j + 1) + ": " + datosTemperatura[j][0] + " °C");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
