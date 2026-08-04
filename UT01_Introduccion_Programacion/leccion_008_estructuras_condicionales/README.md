# Lección 008: Estructuras de Control Condicionales (if, else, switch)

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

La ejecución lineal de instrucciones es insuficiente para resolver problemas computacionales complejos. La ingeniería de software requiere mecanismos de control que permitan al programa alterar dinámicamente su flujo de ejecución basándose en la evaluación de condiciones en tiempo de ejecución.

Java implementa esta capacidad mediante estructuras de control condicional que se dividen en dos vertientes principales:

**1. Estructuras Condicionales de Decisión (`if`, `else-if`, `else`)**
Permiten evaluar una expresión booleana. Si el resultado es verdadero, el bloque de código asociado se ejecuta; de lo contrario, el control salta a un bloque alternativo. El uso explícito de llaves `{}` es una norma de arquitectura obligatoria para delimitar el ámbito de ejecución.

**2. Estructuras de Selección Múltiple (`switch`)**
Cuando una variable debe ser evaluada frente a un conjunto discreto de valores constantes, la estructura `switch` dirige el flujo de manera directa hacia el caso correspondiente. Las versiones modernas de Java optimizan esta sintaxis mediante expresiones con flechas (`->`), evitando caídas accidentales entre casos (*fall-through*).
