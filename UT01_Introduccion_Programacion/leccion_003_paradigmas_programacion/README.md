# Lección 003: Paradigmas: Estructurado vs. Orientado a Objetos

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En las ciencias de la computación, un **paradigma de programación** no es un lenguaje, sino un marco conceptual y arquitectónico que dicta cómo se debe estructurar, organizar y ejecutar el código para resolver un problema.

**1. El Paradigma Estructurado (Procedimental)**
Históricamente dominante en lenguajes como C o Pascal. Se basa en el diseño *Top-Down* (de arriba hacia abajo).
* **Arquitectura:** El programa se divide en bloques lógicos llamados **funciones o procedimientos**. 
* **Gestión de Memoria:** Los datos (variables) y el comportamiento (funciones) están estrictamente separados. Las funciones reciben los datos como parámetros, los procesan y devuelven un resultado.
* **Fallo a escala:** A medida que el sistema crece, rastrear qué función modificó qué variable global se vuelve inmanejable.

**2. El Paradigma Orientado a Objetos (POO)**
El estándar industrial moderno, implementado de forma nativa en Java.
* **Arquitectura:** El programa no se divide en funciones, sino en **Objetos**. Un objeto es una representación matemática de una entidad del mundo real o abstracto.
* **Encapsulamiento:** En lugar de separar datos y comportamiento, la POO los fusiona. Un objeto posee un **estado** (atributos/variables) y un **comportamiento** (métodos/funciones) empaquetados en una unidad blindada.
