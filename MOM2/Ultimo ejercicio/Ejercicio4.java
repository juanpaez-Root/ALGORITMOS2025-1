public class Ejerci1 {

    public static void mostrarInstrucciones() {
        System.out.println("Este programa imprime los números pares entre 1 y 20.");
    }

    public static void imprimirNumerosPares() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        mostrarInstrucciones();
        imprimirNumerosPares();
    }
}

