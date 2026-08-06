# Lección 011: Variables y memoria RAM: declaración, inicialización y asignación

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la ingeniería de software, las variables representan casillas de almacenamiento lógico asociadas directamente a celdas físicas de la memoria RAM del ordenador.

**1. Tipado Estricto y Declaración**
Java exige declarar el tipo de dato antes de usar cualquier variable (`int edad;`), permitiendo al compilador reservar la cantidad exacta de bytes necesarios en memoria.

**2. Inicialización Obligatoria**
Para prevenir comportamientos erráticos, Java prohíbe leer variables locales que no hayan sido inicializadas con un valor de partida (`int edad = 25;`).

**3. Asignación y Mutación**
El valor de una variable puede ser modificado en cualquier momento de la ejecución mediante el operador de asignación (`=`), sobrescribiendo su contenido binario en la RAM.
