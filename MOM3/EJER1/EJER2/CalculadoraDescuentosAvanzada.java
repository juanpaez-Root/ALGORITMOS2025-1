public class CalculadoraDescuentosAvanzada {

    public static void main(String[] args) {
        System.out.println("--- Ejemplo de prueba ---");

        double precioOriginal = 100.00;
        String categoria = "ropa";
        int cantidad = 3;
        boolean esVIP = true;

        double precioFinal = calcularPrecioFinal(precioOriginal, categoria, cantidad, esVIP);

        System.out.println("Precio Original: $" + precioOriginal);
        System.out.println("Categoría: " + categoria);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Cliente VIP: " + esVIP);
        System.out.println("Precio Final con Descuentos: $" + String.format("%.2f", precioFinal));
    }

    public static double obtenerPorcentajeDescuentoCategoria(String categoria) {
        if (categoria.equalsIgnoreCase("electronica")) {
            return 0.10;
        } else if (categoria.equalsIgnoreCase("ropa")) {
            return 0.20;
        } else if (categoria.equalsIgnoreCase("libros")) {
            return 0.05;
        } else {
            return 0.0;
        }
    }

    public static double obtenerPorcentajeDescuentoVolumen(int cantidad) {
        if (cantidad >= 3) {
            return 0.10;
        } else if (cantidad == 2) {
            return 0.05;
        } else {
            return 0.0;
        }
    }

    public static double obtenerPorcentajeDescuentoVIP(boolean esVIP) {
        return esVIP ? 0.07 : 0.0;
    }

    public static double calcularPrecioFinal(double precioOriginal, String categoria, int cantidad, boolean esVIP) {
        // 1. Descuento por categoría
        double precioConDescuentoCategoria = precioOriginal * (1 - obtenerPorcentajeDescuentoCategoria(categoria));

        // 2. Descuento por volumen
        double precioConDescuentoVolumen = precioConDescuentoCategoria * (1 - obtenerPorcentajeDescuentoVolumen(cantidad));

        // 3. Descuento por VIP
        double precioFinal = precioConDescuentoVolumen * (1 - obtenerPorcentajeDescuentoVIP(esVIP));

        return precioFinal;
    }

}
