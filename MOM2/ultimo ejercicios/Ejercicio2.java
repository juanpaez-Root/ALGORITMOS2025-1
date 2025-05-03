import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
       System.out.println("Adivine el número secreto entre 1 y 100. Tiene intentos ilimitados.");
   }
   public static void jugar() {
       Scanner sc = new Scanner(System.in);
       int numeroSecreto = 42; // número fijo
       int intento;
       do {
           System.out.print("Ingrese su intento: ");
           intento = sc.nextInt();
           if (intento < numeroSecreto) {
               System.out.println("El número es mayor.");
           } else if (intento > numeroSecreto) {
               System.out.println("El número es menor.");
           }
       } while (intento != numeroSecreto);
       System.out.println("¡Felicidades! Adivinaste el número.");
   }
    { Scanner scanner = new Scanner(System.in);
       mostrarInstrucciones();
       jugar();
       scanner.closed()
   }
}
