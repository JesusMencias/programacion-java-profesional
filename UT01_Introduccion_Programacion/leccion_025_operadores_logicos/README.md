# Lección 025: Operadores lógicos (&&, ||, !), tablas de verdad y Leyes de De Morgan

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Los operadores lógicos permiten combinar múltiples condiciones booleanas para gobernar el flujo de ejecución de los algoritmos.

### 1. Operadores Fundamentales
* **`&&` (AND):** Conjunción. Verdadero solo si ambos operandos son verdaderos.
* **`||` (OR):** Disyunción. Verdadero si al menos un operando es verdadero.
* **`!` (NOT):** Negación unaria. Invierte el estado booleano.

### 2. Leyes de De Morgan
Herramientas fundamentales de refactorización para simplificar condiciones booleanas complejas negadas:
1. `!(A && B) \equiv !A || !B`
2. `!(A || B) \equiv !A && !B`

Su aplicación correcta previene errores lógicos y mejora la legibilidad del código en entornos de producción.
