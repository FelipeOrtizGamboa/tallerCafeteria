public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Café Americano";
        double precio = 3500;
        int cantidad = 20;
        boolean disponible = true;
        char codigo = 'B';

        System.out.println(String.format("producto: %s", nombre));
        System.out.println(String.format("Precio: %.2f", precio));
        System.out.println(String.format("Cantidad en inventario: %d", cantidad));
        System.out.println(String.format("Disponible hoy: %b", disponible));
        System.out.println(String.format("Código: %c", codigo));
    }
}