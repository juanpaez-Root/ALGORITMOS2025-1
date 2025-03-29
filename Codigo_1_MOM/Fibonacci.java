public class Fibonacci {
    public static void main(String[] args) {
        int n = 5, //Numero de terminos que queremos imprimir
        int a = 0, b = 1, c;

        System.out.println("Usando do-while");
        int i = 1;
        do {
            if (i == 1) {
                System.out.print(a + " "); // Imprime 0
            } else if (i == 2) {
                System.out.print(b + " "); // Imprime 1
            } else if (i == 3) {
                System.out.print(a + " "); // Imprime 1
            } else if (i == 4) {
                c = a + b;
                System.out.print(b + " "); // Imprime 2
            } else if (i == 5) {
                c = a + b;
                System.out.print(c + " "); // Imprime 3
            }
            i++;
        } while (i <= n); // Continuamos hasta imprimir los primeros 5 numeros
        
        System.out.println("\n");

        System.out.println("Usando while");
        a = 0; b = 1; // Reiniciamos los valores    
        i = 1;
        while (i <= n) {
            if (i == 1) {
                System.out.print(a + " "); // Imprime 0
            } else if (i == 2) {
                System.out.print(b + " "); // Imprime 1
            } else if (i == 3) {
                System.out.print(a + " "); // Imprime 1
            } else if (i == 4) {
                c = a + b;
                System.out.print(b + " "); // Imprime 2
            } else if (i == 5) {
                c = a + b;
                System.out.print(c + " "); // Imprime 3
            }
            i++;
        }
    }
}
