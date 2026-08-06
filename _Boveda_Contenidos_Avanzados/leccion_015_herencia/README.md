# Lección 015: Introducción a la Herencia y Reutilización de Código en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

A medida que se modelan sistemas complejos orientados a objetos, es frecuente descubrir que múltiples clases comparten un conjunto idéntico de atributos y comportamientos. Duplicar este código infringe el principio DRY (*Don't Repeat Yourself*). Para resolverlo, la Programación Orientada a Objetos implementa el concepto de **Herencia**.

La herencia es un mecanismo de reutilización y jerarquía que se compone de los siguientes elementos en Java:

**1. Superclases y Subclases (`extends`)**
La herencia establece una relación jerárquica de "es un tipo de" (*is-a*). La **superclase** encapsula los atributos y métodos generales comunes. La **subclase**, mediante el uso de la palabra reservada `extends`, hereda automáticamente toda la estructura no privada de la clase padre.

**2. La Referencia `super`**
Cuando una subclase es instanciada, la palabra reservada `super` se utiliza en su constructor para invocar explícitamente al constructor de la superclase, garantizando una construcción jerárquica coherente en memoria.
