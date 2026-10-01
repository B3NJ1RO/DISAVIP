# Bitacora de tecnicas avanzadas

Laboratorio 07: Tecnicas Avanzadas de Prompting.
Herramienta de IA usada: (escribe aqui cual usaste)

## Ejercicio 2: Zero-shot, one-shot y few-shot
| Tipo | Aciertos (de 5) | Formato de la respuesta | Todas con el mismo formato (Si/No) |
|------|-----------------|-------------------------|------------------------------------|
| Zero-shot | 5 | NINGUNO | NO |
| One-shot | 5 | ESTRUCTURADO | SI |
| Few-shot | 5 | ESTRUCTURADO | SI |

## Ejercicio 3: Chain of Thought
| Pedido | Respuesta de la IA | Muestra los pasos (Si/No) | Correcta (Si/No) |
|--------|--------------------|---------------------------|------------------|
| Directo | 318.60 | NO | SI |
| Paso a paso | Muestra detalladamente todos los pasos hasta llegar a la solución | SI | SI |


## Ejercicio 4: Role prompting
| Version | Vocabulario (sencillo/tecnico) | Usa ejemplos o codigo | A quien le sirve mas |
|---------|-------------------------------|-----------------------|----------------------|
| A. Sin rol | SENCILLO | NO | ESTUDIANTE |
| B. Rol docente | SENCILLO | NO | ESTUDIANTE |
| C. Rol senior | TÉCNICO | SI | JUNIOR |


## Ejercicio 5: Descomposicion
### Diseño de Clases del Sistema (Paso 2)

Para estructurar el sistema de inventario en Java bajo el paradigma orientado al diseño de objetos, se definieron las siguientes 4 clases principales con sus atributos y tipos de datos:

#### 1. Clase `Producto`
Representa cada artículo físico disponible en la tienda y gestiona sus datos individuales.
* `codigo` (`String`): Identificador único o código de barras.
* `nombre` (`String`): Nombre descriptivo del producto.
* `precioVenta` (`double`): Precio unitario al público.
* `stock` (`int`): Cantidad actual disponible en el almacén.
* `stockMinimo` (`int`): Límite para activar la alerta de reposición.

#### 2. Clase `DetalleVenta`
Representa una línea específica dentro de una transacción de venta para asociar la cantidad de un producto.
* `producto` (`Producto`): El objeto producto que se está vendiendo.
* `cantidad` (`int`): Unidades compradas de ese artículo específico.
* `subtotal` (`double`): Valor calculado de la línea (cantidad multiplicada por el precio de venta).

#### 3. Clase `Venta`
Registra la transacción comercial global realizada en la caja de la tienda.
* `idVenta` (`String`): Identificador único del ticket o factura.
* `fechaHora` (`LocalDateTime`): Fecha y hora exacta de la transacción.
* `detalles` (`List<DetalleVenta>`): Lista con los productos y cantidades compradas.
* `total` (`double`): Monto total acumulado a pagar por el cliente.

#### 4. Clase `Inventario`
Centraliza la lógica de negocio, el control de stock, las alertas y la manipulación de los datos en memoria.
* `productos` (`Map<String, Producto>`): Estructura clave-valor (código-producto) para búsquedas instantáneas.
* `historialVentas` (`List<Venta>`): Registro acumulado de todas las ventas efectuadas para reportes.

---

### Código Java de la Clase Producto (Paso 3)

A continuación se muestra la implementación inicial de la clase `Producto` con sus atributos, constructor y métodos get/set:

```java
public class Producto {
    private String codigo;
    private String nombre;
    private double precioVenta;
    private int stock;
    private int stockMinimo;

    // Constructor
    public Producto(String codigo, String nombre, double precioVenta, int stock, int stockMinimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
    }

    // Métodos Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
}
```

## Ejercicio 6: Prompt estructurado y autocritica

```text
PROMPT: Revisa tu tabla: faltan casos limite como campos vacios, correo sin @ o contrasena con espacios? Agrega los que falten e indica cuales agregaste.

RESPUESTA:
Casos agregados en esta revisión
CP-05 y CP-06 (Campos vacíos independientes): Se separó la validación para probar qué sucede cuando falta únicamente el correo o únicamente la contraseña, en lugar de asumir que ambos siempre se envían vacíos a la vez.

CP-07 (Correo sin "@"): Se especificó formalmente como caso límite de sintaxis del correo.

CP-08 (Contraseña con espacios): Se agregó para validar cómo maneja el sistema los espacios en blanco accidentales al copiar y pegar claves.
```


| Qué revisar | Cumple (Sí / No) |
| :--- | :--- |
| ¿Tiene las 4 columnas pedidas? | SI |
| ¿Incluye el bloqueo después de 3 intentos? | SI |
| ¿Incluye casos con campos vacíos? | SI |
| ¿Indica qué casos agregó en la autocrítica? | SI |
| ¿Hay algún caso repetido o que no tenga sentido? | NO |