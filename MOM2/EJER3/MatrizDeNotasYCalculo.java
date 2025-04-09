import java.util.Scanner;

public class MatrizDeNotasYCalculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estudiantes = 3;
        int materias = 4;
        double[] notas = new double[estudiantes][materias];

        //solicitar notas
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("ingrese notas del estudiante" + (i + 1) + ":");
            for (int j = 0; j < materia; j ++) {
                System.out.println("Dar nota de la materia" + (j + 1) + ":");
                notas[i][j] = sc.nextDouble();
            }
        }

        //calcular y mostrar promedio 
        System.out.println("promedio del estudiante");
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) {
                suma + = notas[i][j];
            }
            double promedio = suma / materias
            System.out.println("Estudiante" + (i + 1) + ":" + promedio);
        }

        sc.close();
    }
}