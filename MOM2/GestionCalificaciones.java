import java.util.Scanner;

public class GestionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        // 2. Crear matriz para almacenar calificaciones: [filas = estudiantes][columnas = 3 exámenes]
        double[][] calificaciones = new double[numEstudiantes][3];

        // 3. Llenar la matriz con las calificaciones
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese las calificaciones del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        // 4. Calcular promedio de cada estudiante y guardar en un array
        double[] promedios = new double[numEstudiantes];
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < numEstudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / 3;

            // 5. Contar aprobados y reprobados
            if (promedios[i] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        // 6. Mostrar resultados
        System.out.println("\n--- Resultados Finales ---");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.printf("Estudiante %d - Promedio final: %.2f - %s\n",
                    i + 1,
                    promedios[i],
                    (promedios[i] >= 6.0) ? "Aprobado" : "Reprobado");
        }

        System.out.println("\nTotal de estudiantes aprobados: " + aprobados);
        System.out.println("Total de estudiantes reprobados: " + reprobados);
    }
}