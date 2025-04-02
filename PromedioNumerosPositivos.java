package Momento-02;

public class PromedioNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, contador = 0, numero; 

        System.out.print("Ingrese un número positivo (0 para terminar): ");
        
        while (true) {
            numero = sc.nextInt();
            
            if (numero == 0) {
                break; // Termina el bucle si el número es 0
            }

            if (numero > 0) {
                suma += numero; 
                contador++; 
            }
        }
        scaner.close(); 

        if (contador > 0) {
            double promedio = (double) suma / contador; 
            System.out.println("El promedio de los números positivos es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}
