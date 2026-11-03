public class Ejercicio7 {
    public static void main(String[] args) {
        //El error está al declarar la variable como un entero y recibir los datos de un string
        int cantidadVendida = "5";
        double precioUnitario = 4500;
        //El típico error de sintaxis del ; cerrando la acción
        double total = cantidadVendida * precioUnitario
        boolean aplicaDescuento = (total > 20000);
        // La condición está mal redactada porque en lugar de realizar una comparación nos está indicando que la variable será true
        if (aplicaDescuento = true) {
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}

