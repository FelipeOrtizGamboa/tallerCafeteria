public class SistemaCafeteria {
    public static void main(String[] args) {

        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

        double montoApertura = -1000;
        int intento = 0;

        do {
            intento = intento + 1;

            if (intento == 2) {
                montoApertura = 50000;
            }

            System.out.println("Intento " + intento + ": monto de apertura = " + montoApertura);

            if (montoApertura <= 0) {
                System.out.println("Monto inválido. Debe ser mayor a $0.");
            }

        } while (montoApertura <= 0);

        System.out.printf("Caja abierta con: $%.2f%n", montoApertura);

        // Recorrer lista de pedidos
        for (int i = 0; i < pedidoProducto.length; i++) {

            int indice = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];

            String nombre = nombres[indice];
            double subtotal = precios[indice] * cantidad;
            char categoria = categorias[indice];

            String descripcionCategoria;
            switch (categoria) {
                case 'B':
                    descripcionCategoria = "Bebida caliente";
                    break;
                case 'F':
                    descripcionCategoria = "Bebida fría";
                    break;
                case 'C':
                    descripcionCategoria = "Comida";
                    break;
                case 'P':
                    descripcionCategoria = "Postre";
                    break;
                default:
                    descripcionCategoria = "Categoría desconocida";
            }

            System.out.printf("Pedido %d | %s | Cantidad: %d | Categoría: %s | Subtotal: $%.2f%n",
                    i + 1, nombre, cantidad, descripcionCategoria, subtotal);
        }
    }
}