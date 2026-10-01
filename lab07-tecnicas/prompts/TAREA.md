# Tarea: Mi prompt avanzado

## Tarea elegida
Diseñar las clases y generar casos de prueba para un sistema de consola de una tienda de libros que gestione clientes, su historial de compras, inventario, cuotas (pagos a plazos) y recibos.

## Version 1: prompt basico
```text
Hazme un programa para una tienda de libros que maneje clientes e inventario.
```
**Que obtuve:** un programa generico que solo registra libros y precios, sin clientes, sin historial, sin cuotas ni recibos, y sin estructura de clases clara.

**Problema:** el prompt es demasiado amplio y no dice que modulos quiero, ni en que lenguaje, ni que reglas de negocio aplican.

## Version 2
```text
Crea clases en Java para una tienda de libros que maneje clientes, inventario de libros,
historial de compras, cuotas y recibos. Cada cliente puede comprar a cuotas y tiene un
historial de sus compras.
```
**Tecnica agregada:** descomposicion (listar los modulos en vez de pedir "un programa" completo) y contexto del dominio.

**Por que:** en la v1 la IA no sabia que yo queria cinco modulos concretos; tenia que adivinar.

**Que mejoro:** aparecen las clases Cliente, Libro, Venta, Cuota y Recibo, pero sin atributos definidos, sin ejemplo de uso, y el formato de salida es libre (a veces todo junto, a veces en explicacion larga).

## Version 3: prompt final
```text
Actua como un arquitecto de software Java senior especializado en sistemas de gestion
comercial para pequenas tiendas.

Contexto: es una app de consola en Java estandar (sin librerias externas) para una tienda de libros. Debe manejar cinco modulos: clientes (dni, nombre, telefono), su historial de compras, inventario (codigo, titulo, autor, precio, stock), cuotas (una venta a plazos
dividida en N cuotas con fecha de vencimiento) y recibos (detalle de la venta con fecha, items, total y forma de pago).

Piensa paso a paso antes de escribir codigo: primero identifica las clases y sus relaciones, despues define los atributos, y al final implementa los metodos principales.

Ejemplo de salida esperada para el modulo de cuotas:
Venta v1 = new Venta("V-001", cliente, libros);
v1.generarCuotas(3); // 3 cuotas de S/ total/3, vencimiento mensual
Recibo r1 = v1.generarRecibo(); // imprime items, total, forma de pago "CREDITO"

Formato de respuesta: primero una tabla con Clase | Atributos | Responsabilidad; despues
el codigo Java de cada clase en su propio bloque; al final, 6 casos de prueba en una tabla
Casos | Entrada | Resultado esperado, incluyendo al menos un caso limite (stock en 0,
cuota con numero de plazos 0, dni duplicado).

Restricciones: solo Java estandar, sin base de datos, datos en memoria con List y Map.
Antes de entregar, revisa tu respuesta: verifica que ninguna clase faltante, que cada venta
genere su recibo, y que el total de cuotas sumen el total de la venta. Indica que encontraste
en esa revision.
```
**Tecnicas agregadas:** role prompting (arquitecto de software senior), chain of thought (piensa paso a paso), few-shot (ejemplo concreto de cuotas/recibo), prompt estructurado (secciones Contexto/Formato/Restricciones) y autocritica (revision final).

**Por que:** con la v2 la IA omitia validaciones y no entregaba en el formato que necesito; estas tecnicas cierran esos huecos.

**Que mejoro:** la respuesta llego con la tabla de clases, codigo separado por clase, casos limite incluidos, y una autocritica que corrigio una cuota redondeada mal.

## Tecnicas usadas en el prompt final

| Parte del prompt final | Tecnica |
|---|---|
| "Actua como un arquitecto de software Java senior..." | Role prompting |
| "Piensa paso a paso antes de escribir codigo..." | Chain of Thought |
| "Ejemplo de salida esperada para el modulo de cuotas: ..." | Few-shot |
| "Contexto: ... Formato de respuesta: ... Restricciones: ..." | Prompt estructurado |
| Cinco modulos listados explicitamente | Descomposicion |
| "Antes de entregar, revisa tu respuesta..." | Autocritica |

## Evaluacion del resultado

| Criterio | Si/No |
|---|---|
| ¿Cubre los cinco modulos (clientes, historial, inventario, cuotas, recibos)? | Si |
| ¿El codigo usa solo Java estandar? | Si |
| ¿Incluye al menos un caso limite en los casos de prueba? | Si |
| ¿Las cuotas suman el total de la venta? | Si |
| ¿La respuesta sigue el formato pedido (tabla + codigo + casos)? | Si |

## Por que elegi estas tecnicas

Elegi role prompting porque un "arquitecto senior" produce diseno de clases mas realista que una respuesta generica. Use chain of thought y descomposicion porque pedir todo de una vez daba respuestas superficiales; pedir que razonara primero produjo mejores relaciones entre clases. Use few-shot para fijar el formato del recibo y las cuotas, que era lo que mas variaba entre intentos. El prompt estructurado me dio control del formato de entrega (tabla + codigo + casos). Finalmente use autocritica para que la propia IA detectara errores como cuotas que no suman el total, aunque igual debo revisar el resultado porque la autocritica no es infalible.