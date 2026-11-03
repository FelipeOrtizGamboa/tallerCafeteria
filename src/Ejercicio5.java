public class Ejercicio5 {
    public static void main(String[] args) {

        double montoApertura = -500;
        int intento = 0;

        do {
            intento = intento + 1;

            if (intento == 2) {
                montoApertura = 50000;
            }

            System.out.println("Intento " + intento + ": monto ingresado = " + montoApertura);

            if (montoApertura <= 0) {
                System.out.println("Monto inválido. Debe ser mayor a $0.");
            }

        } while (montoApertura <= 0);

        System.out.printf("Caja abierta con: %.2f%n", montoApertura);
    }
}