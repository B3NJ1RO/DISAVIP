public class Producto {
    private String codigo;
    private String nombre;
    private double precioVenta;
    private int stock;
    private int stockMinimo;

    public Producto(String codigo, String nombre, double precioVenta, int stock, int stockMinimo) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecioVenta(precioVenta);
        setStock(stock);
        setStockMinimo(stockMinimo);
    }

    // 2. Métodos de negocio para manipular el stock de forma segura
    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock -= cantidad;
            return true; // Venta/Salida exitosa
        }
        return false; // Stock insuficiente o cantidad inválida
    }

    // 1. Validaciones en setters
    public void setPrecioVenta(double precioVenta) {
        if (precioVenta < 0) {
            throw new IllegalArgumentException("El precio de venta no puede ser negativo.");
        }
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo < 0) {
            throw new IllegalArgumentException("El stock mínimo no puede ser negativo.");
        }
        this.stockMinimo = stockMinimo;
    }

    // Getters habituales
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecioVenta() { return precioVenta; }
    public int getStock() { return stock; }
    public int getStockMinimo() { return stockMinimo; }

    // 3. Sobrescritura de toString() para impresión rápida
    @Override
    public String toString() {
        return String.format("[%s] %s - Precio: $%.2f - Stock: %d (Mín: %d)", 
                codigo, nombre, precioVenta, stock, stockMinimo);
    }
}