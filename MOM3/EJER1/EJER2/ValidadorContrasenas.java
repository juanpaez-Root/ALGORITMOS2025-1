public class ValidadorContrasenas {

    // Longitud mínima requerida
    private static final int LONGITUD_MINIMA = 8;

    /**
     * Verifica si la contraseña tiene la longitud mínima requerida.
     */
    public static boolean esLongitudValida(String password) {
        return password.length() >= LONGITUD_MINIMA;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     */
    public static boolean contieneMayuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra minúscula.
     */
    public static boolean contieneMinuscula(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos un dígito numérico.
     */
    public static boolean contieneDigito(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña es segura según todos los criterios.
     */
    public static boolean esContrasenaSegura(String password) {
        return esLongitudValida(password) &&
               contieneMayuscula(password) &&
               contieneMinuscula(password) &&
               contieneDigito(password);
    }

    public static void main(String[] args) {
        // Pruebas de ejemplo
        String[] pruebas = {
            "clave123",         // sin mayúscula
            "ClaveSegura1",     // segura
            "OTRAMAYUSCULA2",   // sin minúscula
            "corta1A",          // muy corta
            "Segura123",        // segura
            "soloLetras",       // sin dígito
            "12345678"          // sin letras
        };

        for (String password : pruebas) {
            System.out.println("'" + password + "' es segura? " + esContrasenaSegura(password));
        }
    }
}
