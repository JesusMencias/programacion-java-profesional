# Lección 022: Incremento y decremento: prefijo (++x) vs. postfijo (x++)

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Los operadores unarios de incremento (`++`) y decremento (`--`) permiten modificar el valor de una variable numérica en una unidad. Su comportamiento en expresiones depende estrictamente de su posición.

### 1. Operador en Modo Prefijo (`++x`)
El valor se modifica **antes** de que la variable sea utilizada en la expresión evaluada. La JVM garantiza que el operando esté actualizado antes de cualquier lectura posterior dentro de la misma instrucción.

### 2. Operador en Modo Postfijo (`x++`)
La variable se utiliza con su valor original **durante** la evaluación de la expresión. Solo después de que la expresión ha sido resuelta, la JVM aplica el incremento o decremento en memoria.

### 3. Consideraciones de Ingeniería
El uso de operadores en modo postfijo dentro de expresiones aritméticas complejas suele ser origen de errores difíciles de localizar (*bugs* de lógica). Se recomienda encarecidamente separar la operación de incremento en una instrucción independiente para maximizar la legibilidad y mantenibilidad del código fuente.
