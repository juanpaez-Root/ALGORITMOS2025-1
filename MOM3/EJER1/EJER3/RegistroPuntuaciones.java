import java.util.Scanner;

public class RegistroPuntuaciones {

    // Suponemos un máximo de 5 puntuaciones altas
    static final int MAX_PUNTUACIONES = 5;
    String[] nombresJugadores = new String[MAX_PUNTUACIONES];
    int[] puntuaciones = new int[MAX_PUNTUACIONES];
    int contadorActual = 0;

    // Método para agregar una nueva puntuación
    public void agregarPuntuacion(String nombre, int puntaje) {
        if (contadorActual < MAX_PUNTUACIONES) {
            nombresJugadores[contadorActual] = nombre;
            puntuaciones[contadorActual] = puntaje;
            contadorActual++;
            System.out.println("Puntuación para " + nombre + " registrada.");
        } else {
            System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre + ".");
        }
    }

    // Método para mostrar todas las puntuaciones registradas
    public void mostrarPuntuaciones() {
        System.out.println("\n--- Puntuaciones Más Altas ---");
        if (contadorActual == 0) {
            System.out.println("Aún no hay puntuaciones registradas.");
        } else {
            for (int i = 0; i < contadorActual; i++) {
                System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
            }
        }
        System.out.println("-------------------------------");
    }

    // Método principal
    public static void main(String[] args) {
        RegistroPuntuaciones registro = new RegistroPuntuaciones();
        Scanner teclado = new Scanner(System.in);
        String opcionUsuario = "0";

        while (!opcionUsuario.equals("3")) {
            System.out.println("\nSistema de Puntuaciones Arcade");
            System.out.println("1. Agregar Puntuación");
            System.out.println("2. Mostrar Puntuaciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcionUsuario = teclado.nextLine();

            switch (opcionUsuario) {
                case "1":
                    if (registro.contadorActual < MAX_PUNTUACIONES) {
                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = teclado.nextLine();
                        System.out.print("Puntuación obtenida: ");
                        int puntajeObtenido = teclado.nextInt();
                        teclado.nextLine(); // Limpiar buffer
                        registro.agregarPuntuacion(nombreJugador, puntajeObtenido);
                    } else {
                        System.out.println("El registro de puntuaciones está lleno.");
                    }
                    break;
                case "2":
                    registro.mostrarPuntuaciones();
                    break;
                case "3":
                    System.out.println("Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        teclado.close();
    }
}