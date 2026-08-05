# Lección 019: Cadenas de Caracteres, Inmutabilidad y `StringBuilder` en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT04 — Cadenas de caracteres y arrays
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En el procesamiento de software moderno, la manipulación de texto y cadenas de caracteres es una de las tareas más recurrentes. En Java, la gestión de texto posee particularidades arquitectónicas críticas que afectan de manera directa el rendimiento y el consumo de memoria RAM:

**1. La Inmutabilidad de `String` y el *String Pool***
A diferencia de otros lenguajes, en Java `String` no es un tipo de dato primitivo, sino una clase inmutable de la biblioteca estándar. Una vez que un objeto `String` es creado, su contenido interno no puede ser alterado jamás. Si se modifica, Java genera un objeto nuevo en el Heap. El *String Pool* optimiza recursos reutilizando literales idénticos.

**2. Eficiencia con `StringBuilder` y `StringBuffer`**
Concatenar cadenas repetidamente en bucles degrada el rendimiento. `StringBuilder` provee una clase mutable no sincronizada de alta velocidad para evitar la saturación del recolector de basura.

**3. Expresiones Regulares con `Pattern` y `Matcher`**
Mediante el paquete `java.util.regex`, es posible compilar patrones formales y evaluar cadenas de entrada con rigor matemático para validaciones estrictas.
