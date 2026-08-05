# Lección 017: Clases y Métodos Abstractos en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En el diseño de jerarquías orientadas a objetos complejas, es común encontrar superclases que actúan puramente como conceptos genéricos las cuales no deben ser instanciadas de forma independiente. Para restringir esta instanciación y obligar a las clases hijas a cumplir un contrato estricto, Java implementa las **Clases Abstractas**.

Una clase abstracta se rige bajo los siguientes principios de arquitectura:

**1. Restricción de Instanciación**
Una clase declarada con la palabra reservada `abstract` no puede ser instanciada bajo ningún concepto mediante el operador `new`. Su único propósito funcional es servir como superclase base.

**2. Métodos Abstractos**
Una clase abstracta puede contener métodos normales, pero también métodos abstractos. Un método `abstract` carece de cuerpo o llaves (`{}`); solo define su firma terminada en punto y coma (`;`). Su inclusión obliga a todas las subclases concretas a sobrescribir e implementar dicho método.
