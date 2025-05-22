import java.util.Scanner;
public class ValidadorCedula {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String respuesta;
       System.out.println("Sistema Validador de Formato de Cédulas");
       do {
           System.out.print("Ingrese el número de cédula a validar: ");
           String numeroCedula = scanner.nextLine();
           if (esFormatoCedulaValido(numeroCedula)) {
               System.out.println("Formato de Cédula VÁLIDO.");
           } else {
               // Mostrar motivo del error
               if (numeroCedula.length() != 10) {
                   System.out.println("Formato de Cédula INVÁLIDO. (Error: longitud incorrecta)");
               } else if (!todosDigitos(numeroCedula)) {
                   System.out.println("Formato de Cédula INVÁLIDO. (Error: contiene un no dígito)");
               } else if (numeroCedula.charAt(0) == '0') {
                   System.out.println("Formato de Cédula INVÁLIDO. (Error: empieza con 0)");
               } else {
                   System.out.println("Formato de Cédula INVÁLIDO.");
               }
           }
           System.out.print("¿Desea validar otra cédula? (S/N): ");
           respuesta = scanner.nextLine().toLowerCase();
       } while (respuesta.equals("s"));
       System.out.println("Gracias por usar el sistema.");
   }
   public static boolean esFormatoCedulaValido(String numeroCedula) {
       return numeroCedula.length() == 10 &&
              todosDigitos(numeroCedula) &&
              numeroCedula.charAt(0) != '0';
   }
   public static boolean todosDigitos(String cadena) {
       for (int i = 0; i < cadena.length(); i++) {
           if (!Character.isDigit(cadena.charAt(i))) {
               return false;
           }
       }
       return true;
   }
}
