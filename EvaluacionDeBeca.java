package momento1;

import java.util.Scanner;

public class EvaluacionDeBeca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el promedio de notas: ");
        double promedio = scanner.nextDouble();
        
        System.out.print("Ingrese el porcentaje de asistencia: ");
        double asistencia = scanner.nextDouble();
        
        if (promedio >= 8.5 && asistencia >= 90) {
            System.out.println("Felicidades, calificas para la beca.");
        } else {
            System.out.println("Lo siento, no calificas para la beca.");
        }
        
        scanner.c
        lose();
    }
} 
}
