# Lección 017: Primitivos flotantes: float vs. double, sufijo F, precisión IEEE 754

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Para representar valores con decimales, Java ofrece dos tipos primitivos en coma flotante basados en el estándar internacional IEEE 754.

**1. Tipos y Tamaños**
* **`float`:** 32 bits de precisión simple. Requiere obligatoriamente el sufijo literal **`F`** (`19.99F`).
* **`double`:** 64 bits de precisión doble. Es el tipo predeterminado para números con decimales en Java.

**2. El Estándar IEEE 754 y el Redondeo Binario**
La representación binaria de fracciones decimales finitas puede generar pequeñas imprecisiones acumulativas de redondeo (ej. `0.1 + 0.2 != 0.3` exacto en memoria binaria), un factor crítico a tener en cuenta en ingeniería de software.
