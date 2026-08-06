# Lección 011: Modularidad en Java (Métodos, Parámetros y Retorno)

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

A medida que los sistemas de software crecen en complejidad, la escritura de código en bloques monolíticos se vuelve insostenible, propensa a errores y difícil de depurar. La ingeniería de software resuelve este problema aplicando el principio de modularidad mediante la creación de **métodos**.

Un método es un bloque de código autocontenido que realiza una tarea específica y calculable. En Java, la arquitectura y declaración de un método se estructuran bajo estrictos principios tipados:

**1. Anatomía y Firma del Método**
La signatura de un método define su interfaz de comunicación con el exterior y consta de modificadores de visibilidad y clase (`public static`), tipo de dato de retorno, identificador y la lista de parámetros de entrada tipados.

**2. Paso de Argumentos y Retorno de Valores**
Durante la llamada a un método, los valores enviados son asignados a los parámetros locales (paso por valor). Al finalizar, el método puede devolver un único resultado al flujo llamador mediante el uso explícito de la palabra reservada `return`.
