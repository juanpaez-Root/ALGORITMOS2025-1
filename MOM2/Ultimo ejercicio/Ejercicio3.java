import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        mostrarInstrucciones();
        clasificarEdades();
    }

    // Paso 1: Mostrar instrucciones
    public static void mostrarInstrucciones() {
        System.out.println("Ingrese edades para clasificarlas.");
        System.out.println("Escriba 0 para finalizar el programa.");
    }

    // Paso 2: Leer y clasificar edades
    public static void clasificarEdades() {
        Scanner scanner = new Scanner(System.in);
        int edad;

        while (true) {
            System.out.print("Ingrese una edad: ");
            edad = scanner.nextInt();

            if (edad == 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (edad < 18) {
                System.out.println("→ Menor de edad");
            } else {
                System.out.println("→ Mayor de edad");
            }
        }

        scanner.close();
    }
}

