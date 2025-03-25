package momento1;

import java.util.Scanner;

public class CalculoDeExpresion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        
        if (a - b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            double resultado = (a + b) * c / (a - b);
            System.out.println("El resultado de la expresión es: " + resultado);
        }
        
        scanner.close();

    
}
