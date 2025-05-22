
import java.util.Scanner;

public class CalculadoraTarifasEnvio {

    // Costos base por zona
    public static final double COSTO_BASE_LOCAL = 5000.0;
    public static final double COSTO_BASE_NACIONAL = 15000.0;
    public static final double COSTO_BASE_INTERNACIONAL = 50000.0;

    // Costo adicional por kilogramo
    public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
    public static final double COSTO_ADICIONAL_POR_KG_NACIONAL = 3000.0;
    public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL = 10000.0;

    public static double calcularCostoAdicionalPorPeso(double pesoKg, int zona) {
        if (pesoKg <= 0) {
            return 0.0;
        }

        switch (zona) {
            case 1: return pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
            case 2: return pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
            case 3: return pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
            default:
                return 0.0;
        }
    }

    public static double obtenerCostoBasePorZona(int zona) {
        switch (zona) {
            case 1: return COSTO_BASE_LOCAL;
            case 2: return COSTO_BASE_NACIONAL;
            case 3: return COSTO_BASE_INTERNACIONAL;
            default:
                return 0.0;
        }
    }

    public static double calcularTarifaTotal(double pesoKg, int zona) {
        double costoBase = obtenerCostoBasePorZona(zona);
        double costoAdicional = calcularCostoAdicionalPorPeso(pesoKg, zona);
        return costoBase + costoAdicional;
    }

    public static String obtenerNombreZona(int zona) {
        return switch (zona) {
            case 1 -> "Local";
            case 2 -> "Nacional";
            case 3 -> "Internacional";
            default -> "Desconocida";
        };
    }

    public static int solicitarZona(Scanner scanner) {
        int zona = 0;
        do {
            System.out.println("Ingrese la zona de envío (1: Local, 2: Nacional, 3: Internacional):");
            if (scanner.hasNextInt()) {
                zona = scanner.nextInt();
                if (zona >= 1 && zona <= 3) {
                    break;
                } else {
                    System.out.println("Zona no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Debe ingresar un número.");
                scanner.next(); // limpiar entrada inválida
            }
        } while (true);
        return zona;
    }

    public static double solicitarPeso(Scanner scanner) {
        double peso = -1;
        do {
            System.out.println("Ingrese el peso del paquete en kg (mayor a 0):");
            if (scanner.hasNextDouble()) {
                peso = scanner.nextDouble();
                if (peso >= 0) {
                    break;
                } else {
                    System.out.println("El peso no puede ser negativo.");
                }
            } else {
                System.out.println("Entrada no válida. Debe ingresar un número.");
                scanner.next(); // limpiar entrada inválida
            }
        } while (true);
        return peso;
    }

    public static boolean deseaContinuar(Scanner scanner) {
        System.out.println("¿Desea calcular otra tarifa? (s/n):");
        String respuesta = scanner.next().toLowerCase();
        return respuesta.equals("s");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora de Tarifas de Envío - Logística Veloz S.A. ===");

        do {
            double peso = solicitarPeso(scanner);
            int zona = solicitarZona(scanner);

            double tarifaFinal = calcularTarifaTotal(peso, zona);
            String nombreZona = obtenerNombreZona(zona);

            System.out.println("\n--- Resultado ---");
            System.out.println("Zona de destino: " + nombreZona);
            System.out.printf("Tarifa total de envío: $%.2f%n", tarifaFinal);
            System.out.println("-----------------------------\n");

        } while (deseaContinuar(scanner));

        System.out.println("Gracias por usar la calculadora. ¡Hasta pronto!");
        scanner.close();
    }
}
