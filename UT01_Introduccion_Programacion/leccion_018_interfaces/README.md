# Lección 018: Interfaces y Contratos Múltiples en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la Programación Orientada a Objetos avanzada, el desacoplamiento de componentes es un requisito arquitectónico fundamental. Aunque la herencia simple resuelve la generalización jerárquica, resulta insuficiente cuando un objeto necesita adoptar comportamientos totalmente independientes provenientes de múltiples fuentes. Para solucionar esta limitación, Java implementa las **Interfaces**.

Una interfaz es un contrato de diseño puro que se rige bajo los siguientes principios:

**1. Definición del Contrato (`interface`)**
Una interfaz se declara utilizando la palabra reservada `interface`. Contiene exclusivamente métodos abstractos públicos (sin cuerpo) y constantes estáticas implícitas. No puede ser instanciada directamente.

**2. Implementación Múltiple (`implements`)**
Una clase puede comprometerse a cumplir el contrato de una interfaz utilizando `implements`. Lo verdaderamente potente en la arquitectura de software es que **una clase puede implementar múltiples interfaces** separadas por comas, simulando de forma limpia la herencia múltiple de comportamiento.
