# Lección 027: Operadores bit a bit (bitwise) y desplazamientos (<<, >>, >>>) [EXTRA]

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Los operadores a nivel de bits permiten manipular directamente la representación binaria de los tipos enteros en Java, ofreciendo un rendimiento ultraeficiente en tareas de bajo nivel.

### 1. Operadores Bitwise Básicos
* **AND (`&`)**: Evalúa ambos bits; retorna `1` solo si ambos son `1`.
* **OR (`|`)**: Retorna `1` si al menos un bit es `1`.
* **XOR (`^`)**: Retorna `1` si los bits son diferentes.
* **Complemento (`~`)**: Invierte todos los bits del operando.

### 2. Operadores de Desplazamiento (*Shift*)
* **Izquierda (`<<`)**: Multiplica el valor por potencias de dos rellenando con ceros.
* **Derecha con Signo (`>>`)**: Divide el valor entre potencias de dos preservando el bit de signo.
* **Derecha sin Signo (`>>>`)**: Desplaza a la derecha rellenando estrictamente con ceros a la izquierda, ignorando el signo original.
