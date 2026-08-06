# Lección 013: Ámbito de variables (scope): locales vs. de instancia

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

El **ámbito (*scope*)** delimita la región del código fuente donde una variable es visible, accesible y válida para ser procesada por el compilador.

**1. Variables Locales**
Declaradas dentro de métodos, constructores o bloques delimitados por llaves (`{}`). Viven en el Stack y su ciclo de vida concluye de forma automática al salir de su bloque de origen.

**2. Variables de Instancia (Atributos)**
Declaradas a nivel de clase pero fuera de los métodos. Residen en el Heap formando parte del estado interno del objeto, acompañándolo durante todo su tiempo de vida activo.
