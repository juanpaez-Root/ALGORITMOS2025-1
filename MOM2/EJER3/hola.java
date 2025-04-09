import java.util.Scanner;

public class hola {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[5];
        int suma = 0;

        //solicitar al usuario que ingrese los numeros
        System.out.println("coloque 5 numeros enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.println("numero " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }

        //suma total 
        System.out.println("suma total de los numeros es: " + suma);

        sc.close();
    }
}
