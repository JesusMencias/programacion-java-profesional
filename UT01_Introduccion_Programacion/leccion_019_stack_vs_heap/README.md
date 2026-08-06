# Lección 019: Stack vs. Heap: primitivos vs. tipos de referencia

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la arquitectura de la JVM, la memoria RAM se divide en dos áreas clave para optimizar el rendimiento y la ejecución del software.

**1. La Pila (*Stack*)**
Memoria rápida LIFO dedicada a marcos de ejecución de métodos. Almacena de forma directa los valores de los **tipos primitivos** y las direcciones de memoria de las referencias.

**2. El Montículo (*Heap*)**
Espacio amplio y dinámico donde residen todos los **objetos** e instancias creadas con `new`. Los tipos de referencia almacenan un puntero en el Stack que apunta directamente al objeto real en el Heap.
