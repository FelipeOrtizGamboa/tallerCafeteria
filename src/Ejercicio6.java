public class Ejercicio6 {
    public static void main(String[] args) {

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double suma = 0;

        System.out.println("MENÚ DEL DÍA");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, productos[i], precios[i]);
            suma = suma + precios[i];
        }

        double promedio = suma / precios.length;
        System.out.printf("Precio promedio del menú: $%.2f%n", promedio);
    }
}