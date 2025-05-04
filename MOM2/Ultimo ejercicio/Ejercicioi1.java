public import java.util.Scanner;
public static void Ejercicio4() {
  
    Scanner scanner = new Scanner(System.in);
   int contador = 0;
   int numero;
   System.out.println("Ingrese un número:");
   numero = scanner.nextInt();
   while (numero != -1) {
       if (numero > 0) {
           contador++;
       }
       System.out.println("Ingrese otro número:");
       numero = scanner.nextInt();
   }
   System.out.println("Cantidad de números positivos ingresados: " + contador);
} {
    
}
