# Lección 029: Conversiones: casting implícito/explícito, parseo y String.valueOf()

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En Java, la transformación de datos entre distintos tipos requiere el dominio de los mecanismos de conversión estricta.

### 1. Casting Implícito vs. Explícito
* **Implícito (*Widening*):** Conversión automática de un tipo menor a uno mayor (ej. `int` a `long`). Cero riesgo de pérdida de datos.
* **Explícito (*Narrowing*):** Conversión forzada de un tipo mayor a uno menor mediante sintaxis `(tipo) valor`. Conlleva riesgo de truncamiento de decimales o desbordamiento.

### 2. Parseo y Serialización Textual
* **Parseo:** Transformación de representaciones textuales (`String`) a valores numéricos mediante clases Wrapper (`Integer.parseInt()`).
* **`String.valueOf()`:** Método seguro y estándar para convertir cualquier tipo primitivo u objeto en una cadena de texto imprimible, gestionando valores nulos de manera óptima.
