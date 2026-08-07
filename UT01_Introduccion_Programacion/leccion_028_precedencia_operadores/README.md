# Lección 028: Precedencia de operadores y uso de paréntesis

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Cuando múltiples operadores intervienen en una única sentencia, Java aplica reglas estrictas para determinar el orden de ejecución.

### 1. Tabla de Precedencia y Asociatividad
La jerarquía define prioridades técnicas (por ejemplo, los operadores multiplicativos `*`, `/`, `%` tienen mayor precedencia que los aditivos `+`, `-`). Ante operadores del mismo nivel, la asociatividad izquierda-derecha dicta el flujo.

### 2. El Papel Arquitectónico de los Paréntesis `()`
Los paréntesis poseen la **máxima precedencia** en cualquier expresión de Java. Su uso explícito permite:
* Sobrescribir el orden predeterminado de cálculo de manera segura.
* Eliminar ambigüedades lógicas en equipos de desarrollo.
* Mejorar drásticamente la legibilidad del código fuente, reduciendo los errores lógicos (*bugs*) en producción.
