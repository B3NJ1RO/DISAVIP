# Bitacora de prompts
 
Laboratorio 06: Fundamentos de Ingenieria de Prompts.
 
Herramienta de IA usada: Claude

## Ejercicio 2: Tokens y ventana de contexto

| Texto | Caracteres | Tokens |
|-------|------------|--------|
| Los estudiantes programan en Java. | 7 | 34 |
| The students program in Java. | 6 | 29 |
| desafortunadamente | 4 | 18 |

Se hizo la prrueba de preguntar en un chat sobre el desarrollo de una tienda virtual con Java Swing. Al abrir otro chat la IA me pidió información para esta. Entonces podemos sacar como resultado que el contexto se ha perdido al abrir otro chat dentro del mismo modelo.
 
## Ejercicio 3: Temperatura

| Temperatura | % de BiblioTec | Nombres en los 5 intentos |
|-------------|----------------|---------------------------|
| 0 | 100% | BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 0.5 | 65,3% | BiblioTec, LibroYa, BiblioTec, LibroYa, LibroYa |
| 1 | 44,5% | PaginaLibre, BiblioTec, PrestaLibro, LibroYa, PrestaLibro |
| 1.8 | 32,2% | PrestaLibro, LibroYa, PaginaLibre, LibroYa, LibroYa |

## Ejercicio 4: Prompt vago vs estructurado
 
| Criterio | Prompt vago | Prompt estructurado |
|----------|-------------|---------------------|
| Menciona el objetivo del sistema | NO | SI |
| Menciona a los usuarios principales | NO | SI |
| Tiene exactamente 3 funcionalidades | NO | SI |
| Esta en 3 parrafos | NO | SI |
| Lo usaria en un informe real | NO | SI |

## Ejercicio 5: Anatomia de un prompt

| Componente | Texto de mi prompt |
|------------|--------------------|
| Rol | Desarrolladfor de Java  |
| Instruccion | Crea un programa en Java para gestionar los productos de una tienda. Explica primero la estructura de la clase y luego presenta el código Java |
| Contexto | Usando una clase Producto con los atributos: código, nombre, precio y stock. Desarrollar un sistema completo de gestión de inventario |
| Ejemplo | Usa este estilo para los métodos: getPrecio(), setPrecio(double precio) (patrón camelCase estándar de Java) |
| Formato | 1. Explicación de la estructura de clases primero. 2. Presentación del código Java comentado. 3. Métodos con nomenclatura: get + Atributo(), set + Atributo(tipo), is + Condición(). 4. Documentación completa con Javadoc |
 
## Ejercicio 6: Del prompt basico al profesional

# Evaluación de la respuesta del prompt: login con Java Swing

| Qué revisar | Cumple (Sí / No) | Justificación |
|---|---|---|
| ¿Está escrito en Java y usa Swing? | **Sí** | Usa `JFrame`, `JPanel`, `JTextField`, `JPasswordField`, `JButton` y `JLabel`. |
| ¿Pide correo y contraseña? | **Sí** | `LoginFrame` tiene un `JTextField` para el correo y un `JPasswordField` para la contraseña. |
| ¿Explica el funcionamiento antes o después del código? | **Sí** | Lo explica **después** del código: primero se presentaron los archivos y luego la explicación de cada clase y del flujo. |
| ¿El código está organizado en clases? | **Sí** | Son cinco clases, cada una con una responsabilidad: `Main`, `LoginFrame`, `PrincipalFrame`, `AuthService` y `Usuario`. |
| ¿Valida los datos que ingresa el usuario? | **Sí** | Comprueba que los campos no estén vacíos, valida el formato del correo con una expresión regular y verifica las credenciales en `AuthService`. |

### Prompt profesional

```
Actua como desarrollador Java. Crea un ejemplo de login para una aplicacion de escritorio utilizando Swing. El usuario debe ingresar correo y contrasena. Explica brevemente el funcionamiento y presenta el codigo organizado por clases.
```

### Prompt profesional mejorado

```
Mejora el codigo anterior con estas restricciones: no uses librerias externas, valida que el correo contenga @ y que la contrasena tenga al menos 8 caracteres, y muestra los mensajes con JOptionPane. Mejora el codigo anterior con estas restricciones: no uses librerias externas, valida que el correo contenga @ y que la contrasena tenga
al menos 8 caracteres, y muestra los mensajes con JOptionPane.
```
