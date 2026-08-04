# Lección 009: Estructuras de Control Iterativas (`while`, `do-while`, `for`)

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

La capacidad de repetir un bloque de instrucciones de manera automatizada es uno de los pilares fundamentales de la computación. En la ingeniería de software, los bucles o estructuras iterativas evitan la duplicación de código, optimizan el rendimiento y permiten procesar colecciones masivas de datos o esperar eventos condicionales.

Java implementa tres estructuras iterativas principales, cada una adaptada a un caso de uso arquitectónico específico:

**1. El Bucle de Pre-comprobación (`while`)**
Evalúa una condición booleana antes de permitir la ejecución del bloque interno. Si la condición resulta falsa desde el inicio, el bloque de código se omite por completo.

**2. El Bucle de Post-comprobación (`do-while`)**
Ejecuta el bloque de código interno de manera incondicional al menos una vez, evaluando la condición de continuidad al finalizar la iteración.

**3. El Bucle Indexado de Control Estricto (`for`)**
Diseñado para situaciones donde el número de iteraciones es conocido. Su cabecera centraliza la inicialización de la variable de control, la condición de parada y la expresión de incremento en una sola línea compacta.
