# Lección 007: Compilador JIT (Just-In-Time) y gestión de memoria base

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la ingeniería de sistemas avanzados, el rendimiento de una máquina virtual depende de su capacidad para eliminar cuellos de botella en tiempo de ejecución.

**1. El Compilador JIT (Just-In-Time)**
* **Detección de Hot Spots:** La JVM supervisa la ejecución y localiza fragmentos de código ejecutados de forma masiva (*puntos calientes*).
* **Optimización Nativa:** El compilador JIT traduce ese Bytecode directamente a código máquina nativo optimizado para la CPU, logrando velocidades de ejecución comparables a lenguajes compilados estáticamente.

**2. Fundamentos de Gestión de Memoria en la JVM**
* **Stack (Pila):** Memoria estructurada LIFO destinada a marcos de ejecución de métodos, referencias y variables locales.
* **Heap (Montículo):** Área dinámica para el almacenamiento de objetos instanciados mediante `new`, gestionados automáticamente por el recolector de basura.
