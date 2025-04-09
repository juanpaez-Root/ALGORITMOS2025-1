import java.util.Scanner;

public class OperacionFactorial {

    public static void main(String[] args) {
        int numA = 0, numB = 0;
        int varcontrol = 0;

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");
        
        while (varcontrol != 6) {
            System.out.println("1. Sumar dos numeros\r\n" + //
                            "2.Restar dos números\r\n" + //
                            "3.Multiplicar dos números\r\n" + //
                            "4.Dividir dos números\r\n" + //
                            "5.Factorial de un número\r\n* " + //
                            "6.Salir\r\n");
             System.out.println(s:"Opcion selecionada");
             varcontrol = Scanner.nextInt();
            
            
            switch (varcontrol) {
                case 1:
                System.out.print(s:"Ingrese nùmero A: ");
                numA = scanner.nextInt();
                System.out.print(s:"ingrese nùmero B: ")
                numB = Scanner.nextInt();

                System.out.println(numA + " + " +numB + " = " + (numA+numB));
           
                break;
                case 2:
                System.out.print(s:"Ingrese nùmero A: ");
                numA = scanner.nextInt();
                System.out.print(s:"ingrese nùmero B: ")
                numB = Scanner.nextInt();

                System.out.println(numA + " - " +numB + " = " + (numA+numB));
                
                break;
                case 3:
                System.out.print(s:"Ingrese nùmero A: ");
                numA = scanner.nextInt();
                System.out.print(s:"ingrese nùmero B: ")
                numB = Scanner.nextInt();

                System.out.println(numA + " * " +numB + " = " + (numA+numB));
                
                break;
                case 4:
                System.out.print(s:"Ingrese nùmero A: ");
                numA = scanner.nextInt();
                System.out.print(s:"ingrese nùmero B: ")
                numB = Scanner.nextInt();

                System.out.println(numA + " / " +numB + " = " + (numA+numB));

                break;
                case 5:
                System.out.print(s:"Ingrese nùmero A: ");
                numA = scanner.nextInt();
                System.out.print(s:"ingrese nùmero B: ")
                numB = Scanner.nextInt();

                System.out.println(numA + " ! " + numB + " = " + (numA+!+numB));

                break;
                case 6:
                System.out.println(x:"Gracias, Hasta pronto!");

                break;
        
                default:
                System.out.println(x:"Opcion no valida!");

                break;


                
            }
        }
    }
                Scanner.close();
                
                
                