import java.util.Scanner;

public class EjercicioClase {

    static final double PI = 3.141516;
    static double radio = 0.0;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarResultadosFigura();
    }

    static double calcularperimetrorectangular() {
        double a; // Variable de Altura
        double b; // Variable de Base
        double p; // Variable de Resultado

        System.out.println("Ingrese Altura: ");
        a = scanner.nextDouble();

        System.out.println("Ingrese Base: ");
        b = scanner.nextDouble();

        p = 2 * (b + a); // Operaciones

        return p; // Retorno de la respuesta
    }

    public static double areaRectangulo() {
        double l1;
        double l2;

        System.out.println("Ingrese Altura: ");
        l1 = scanner.nextDouble();

        System.out.println("Ingrese Base: ");
        l2 = scanner.nextDouble();

        return l1 * l2;
    }

    public static double areaCirculo() {
        return PI * (Math.pow(radio, 2));
    }

    public static void mostrarResultadosFigura() {
        System.out.println("Ingrese el radio del circulo");
        radio = scanner.nextDouble();

        System.out.println("Figura: Circulo");
        System.out.println("Area: " + areaCirculo());

        System.out.println("Figura: Rectangulo");
        System.out.println("Perimetro: " + calcularperimetrorectangular());
        System.out.println("Area: " + areaRectangulo());
    }
}

