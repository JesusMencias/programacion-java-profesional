# Lección 016: Primitivos enteros: byte, short, int, long, rangos y desbordamiento

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Java ofrece cuatro tipos primitivos para almacenar valores enteros, adaptándose mediante distintas capacidades de memoria en bits.

**1. Tipos y Rangos**
* **`byte`:** 8 bits ($-128$ a $127$).
* **`short`:** 16 bits ($-32,768$ a $32,767$).
* **`int`:** 32 bits ($\\approx \\pm 2.14 \\times 10^9$). Tipo predeterminado estándar.
* **`long`:** 64 bits para valores masivos (requiere sufijo literal `L`).

**2. El Desbordamiento (*Overflow*)**
Ocurre cuando un cálculo excede los límites físicos del tipo de dato, provocando una inversión silenciosa del valor hacia el extremo opuesto del rango.
