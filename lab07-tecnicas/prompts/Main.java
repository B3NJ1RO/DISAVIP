public class Main {
    public static void main(String[] args) {
        // Probamos la clase Producto que está en la misma carpeta
        Producto p1 = new Producto("P001", "Camisa", 25.50, 10, 3);
        System.out.println(p1);
        
        p1.reducirStock(2);
        System.out.println("Stock actualizado: " + p1.getStock());
    }
}