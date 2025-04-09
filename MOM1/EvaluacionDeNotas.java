package momento1;

import java.util.Scanner;

public class EvaluacionDeNotas {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la calificación del examen (0 - 10): ");
        double calificacion = scanner.nextDouble();
        
        if (calificacion >= 0 && calificacion <= 10) {
            if (calificacion >= 6) {
                System.out.println("Felicidades, has aprobado el examen.");
            } else {
                System.out.println("Lo siento, has reprobado el examen.");
            }
        } else {
            System.out.println("Error: La calificación debe estar entre 0 y 10.");
        }
        
        scanner.close();

}
