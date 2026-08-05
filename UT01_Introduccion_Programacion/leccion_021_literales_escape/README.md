# Lección 021: Literales y Secuencias de Escape en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En el desarrollo de software, la forma en que los datos estáticos son inyectados directamente en el código fuente se rige mediante **literales**. Asimismo, la representación visual y el formateo de los datos alfanuméricos exigen el uso de caracteres de control especiales conocidos como **secuencias de escape**.

**1. Tipos de Literales en Java**
Un literal es la notación fuente para representar un valor fijo (enteros por defecto `int`, sufijo `L` para `long`, decimales por defecto `double`, sufijo `F` para `float`)[cite: 1].

**2. Secuencias de Escape**
Cuando se requiere representar caracteres especiales reservados, se emplea la barra invertida (`\`) como prefijo:
* `\n`: Salto de línea
* `\t`: Tabulación horizontal
* `\"`: Comillas dobles
* `\\`: Barra invertida

**3. Inferencia de Tipos con `var` (Java 10+)**
Permite declarar variables locales infiriendo su tipo estático en tiempo de compilación basándose en el literal asignado.
