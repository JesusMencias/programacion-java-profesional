# Lección 006: Tipos de Datos Primitivos en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En los lenguajes de programación de tipado estático estricto como Java, el almacenamiento y manipulación de la información exigen una definición rigurosa del tipo de dato antes de su utilización en memoria. Un tipo de dato define el conjunto de valores permitidos y las operaciones válidas que pueden realizarse sobre ellos.

Los tipos primitivos son los bloques constructores más elementales del lenguaje; no son objetos y almacenan directamente su valor en la pila de memoria (*stack*), lo que garantiza una velocidad de procesamiento óptima. Java cuenta con exactamente 8 tipos de datos primitivos agrupados en cuatro familias:

**1. Enteros (Signed Integer Types)**
* **`byte`**: Utiliza 8 bits. Rango de almacenamiento compacto de -128 a 127.
* **`short`**: Utiliza 16 bits. Rango intermedio de -32,768 a 32,767.
* **`int`**: Utiliza 32 bits. Es el tipo de dato entero estándar y por defecto para cualquier operación matemática común.
* **`long`**: Utiliza 64 bits. Diseñado para representar enteros de magnitud masiva, requiriendo el sufijo `L` o `l` en su literal.

**2. Coma Flotante / Decimales (Floating-Point Types)**
* **`float`**: Utiliza 32 bits de precisión simple. Requiere obligatoriamente el sufijo `f` o `F`.
* **`double`**: Utiliza 64 bits de precisión doble. Es el tipo predeterminado para cálculos decimales por su alta exactitud.

**3. Caracteres y Lógicos**
* **`char`**: Utiliza 16 bits sin signo para almacenar un único carácter tipográfico bajo el estándar Unicode.
* **`boolean`**: Representa un único bit de información con valores lógicos estrictos: `true` o `false`.
