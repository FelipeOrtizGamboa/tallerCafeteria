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
    }
}