# Lección 024: Operador ternario

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

El **operador ternario** (`?:`) es la única estructura en Java que acepta tres operandos, ofreciendo una sintaxis condensada para evaluaciones lógicas de asignación.

### 1. Sintaxis
La estructura es: `condición ? valor_verdadero : valor_falso;`
* **Condición:** Expresión que evalúa a `boolean`.
* **Resultado:** El valor asignado depende exclusivamente de la veracidad de la condición.

### 2. Normativa de Ingeniería
* **Asignación Obligatoria:** A diferencia de una sentencia `if` pura (que puede ejecutar código sin retornar valor), el operador ternario **debe** devolver un resultado que sea asignable o utilizable dentro de otra expresión.
* **Mantenibilidad:** Se desaconseja el anidamiento de operadores ternarios. La brevedad no justifica la pérdida de legibilidad en el flujo lógico. Ante estructuras complejas, el bloque `if-else` es el estándar de oro para la claridad del código.
