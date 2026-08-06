# Lección 014: Constantes: final, static final y convención SNAKE_CASE

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la ingeniería de software, los valores que no deben cambiar bajo ninguna circunstancia se gestionan mediante **constantes inmutables**.

**1. El Modificador `final`**
Impide la reasignación de una variable tras su inicialización. Cualquier intento de modificar un valor marcado como `final` genera un error de compilación.

**2. Constantes de Clase con `static final`**
Combinar `static` (perteneciente a la clase y compartido en memoria) con `final` (inmutable) establece el estándar definitivo para declarar constantes globales eficientes en Java.

**3. Convención `SNAKE_CASE`**
Para diferenciar claramente las constantes de las variables mutables, se emplea obligatoriamente el formato en mayúsculas separadas por guiones bajos (`MAXIMO_INTENTOS_LOGIN`).
