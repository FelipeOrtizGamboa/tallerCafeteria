public class Ejercicio4 {
    public static void main(String[] args) {

        int inventario = 50;
        int consumoPorPedido = 3;
        int numeroPedido = 1;

        while (inventario >= 10) {
            inventario = inventario - consumoPorPedido;
            System.out.println("Pedido " + numeroPedido + " -> Inventario restante: " + inventario);
            numeroPedido = numeroPedido + 1;
        }
    }
}
