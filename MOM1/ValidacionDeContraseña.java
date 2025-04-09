package momento1;

import java.util.Scanner;

public class ValidacionDeContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username = "";
        String Password = "";

        boolean Key = true

        System.out.println("ingrese el usuario:");
       username = scanner.nextLine();
      
       System.out.println("ingrese la contraseña:");
    Password = scanner.nextLine();


if (username.equals("admin") && Password.equals("Da2456-*") ) {
    System.out.println("acceso permitido");
    
    
} else {
    System.out.println("acceso NO permitido");
    
    scanner.closed;
}
       
       
