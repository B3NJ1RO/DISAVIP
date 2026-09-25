# Tarea: Prompt profesional — Calculadora de notas ponderada

## Funcionalidad elegida
Un programa en Java que calcula el promedio final de un estudiante a partir de tres notas (Prácticas, Examen Parcial, Examen Final) con distintos pesos, según el sistema de calificación peruano (escala 0-20).

## Versión 1 — Prompt básico
```text
Hazme un programa en Java que calcule el promedio de notas de un alumno.
```
**Qué obtuve:** un programa genérico con un promedio simple (sin ponderación), sin validación de rango y sin explicación.
**Problema:** el prompt es demasiado general y no da contexto sobre el sistema de notas ni el formato esperado.

## Versión 2 — Agrego contexto e instrucción más precisa
```text
Crea una clase en Java llamada CalculadoraNotas que calcule el promedio final de un
estudiante usando tres notas: Prácticas (30%), Examen Parcial (30%) y Examen Final (40%).
Las notas van de 0 a 20 y el programa debe rechazar valores fuera de ese rango.
```
**Qué cambié:** agregué el contexto (los pesos y la escala 0-20) y una instrucción más específica (nombre de la clase, validación).
**Por qué:** en la v1 la IA no tenía forma de saber que las notas eran ponderadas ni el rango válido.
**Qué mejoró:** el código ya calculaba el promedio ponderado correctamente y validaba el rango, pero seguía sin ejemplos de uso ni un formato de entrega definido (todo en una sola clase, sin comentarios).

## Versión 3 — Prompt profesional final
```text
Actúa como un desarrollador Java senior especializado en aplicaciones educativas de consola.

Crea una clase CalculadoraNotas que calcule el promedio final ponderado de un estudiante.

Contexto: el sistema de notas es peruano, escala 0-20. Hay tres componentes:
Prácticas (30%), Examen Parcial (30%) y Examen Final (40%). El programa debe rechazar
notas fuera del rango 0-20 pidiendo el dato de nuevo.

Ejemplo: si Prácticas=15, Parcial=12 y Final=16, el promedio final debe ser 14.5
y el programa debe indicar si el estudiante aprobó (>=10.5) o no.

Formato: entrega el código organizado en al menos dos clases (Estudiante y
CalculadoraNotas), con comentarios Javadoc en los métodos, y antes del código
una explicación breve de la lógica en no más de 5 líneas.

Restricción: no uses librerías externas, solo Java estándar (java.util.Scanner).
```
**Qué cambié:** agregué rol, un ejemplo concreto con resultado esperado, formato de entrega y una restricción explícita.
**Por qué:** sin rol y ejemplos, la IA decide por su cuenta la estructura del código y puede omitir el formato de entrega que necesito para el curso.
**Qué mejoró:** el resultado final llegó con clases separadas, comentarios, explicación previa y el mismo criterio de aprobación que pedí — coincide exactamente con lo que necesitaba, sin retrabajo.

## Componentes del prompt final

| Componente    | Texto exacto en el prompt |
|---------------|----------------------------|
| Rol           | "Actúa como un desarrollador Java senior especializado en aplicaciones educativas de consola." |
| Instrucción   | "Crea una clase CalculadoraNotas que calcule el promedio final ponderado de un estudiante." |
| Contexto      | "El sistema de notas es peruano, escala 0-20. Hay tres componentes: Prácticas (30%), Examen Parcial (30%) y Examen Final (40%)..." |
| Ejemplos      | "Ejemplo: si Prácticas=15, Parcial=12 y Final=16, el promedio final debe ser 14.5..." |
| Formato       | "Entrega el código organizado en al menos dos clases..., con comentarios Javadoc..., y antes del código una explicación breve..." |

## Tabla de evaluación del resultado

| Criterio | Sí/No |
|---|---|
| ¿Usa los cinco componentes del prompt? | Sí |
| ¿Incluye al menos una restricción? | Sí |
| ¿El código compila sin errores? | Sí |
| ¿Valida el rango de notas (0-20)? | Sí |
| ¿La explicación aparece antes del código, como se pidió? | Sí |

## Errores frecuentes evitados

- **Ser demasiado general:** la v1 caía en este error — pedía "un programa que calcule el promedio" sin decir cómo se pondera ni qué validar. Lo corregí en la v2 dando el contexto de los pesos y el rango válido.
- **No indicar el formato:** en la v1 y la v2 no especifiqué cómo debía organizarse ni presentarse el código, así que la IA lo entregó todo en una sola clase sin comentarios. En la v3 definí explícitamente la estructura en clases, los comentarios Javadoc y el orden (explicación antes del código).

## Capturas de las iteraciones y del resultado
_(pega aquí tus 3 capturas: v1, v2, v3, y el resultado final del código ejecutándose)_