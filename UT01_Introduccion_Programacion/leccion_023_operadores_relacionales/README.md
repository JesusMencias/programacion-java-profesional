# Lección 023: Operadores relacionales

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Los operadores relacionales permiten la evaluación lógica entre dos operandos, fundamentales para cualquier estructura de control (if/else, while).

### 1. Operadores de Comparación
Java soporta los seis operadores relacionales estándar:
* **Igualdad (`==`)** y **Desigualdad (`!=`)**.
* **Comparadores de orden (`>`, `<`, `>=`, `<=`)**.
Toda expresión relacional resulta en un valor de tipo **`boolean`**.

### 2. La Trampa de las Referencias (Primitivos vs. Objetos)
Es vital entender la diferencia arquitectónica en cómo Java evalúa la igualdad:
* **Primitivos:** `==` compara el **valor** almacenado en el Stack. Es seguro y preciso.
* **Tipos de Referencia:** `==` compara la **referencia (puntero)** a la memoria Heap. Si dos objetos son distintos en memoria, `==` retornará `false` aunque su contenido sea idéntico.

**Recomendación de Ingeniería:** Para comparar el contenido o estado de dos objetos (como `String` o entidades), utilice siempre el método `.equals()`. La comparación con `==` sobre objetos suele ser un error lógico que produce comportamientos inesperados en producción.
