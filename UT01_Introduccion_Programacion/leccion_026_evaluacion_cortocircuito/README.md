# Lección 026: Evaluación en cortocircuito: prevención de NullPointerException y ArithmeticException

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la ingeniería de software, la prevención de fallos en tiempo de ejecución es vital. Java implementa la **evaluación en cortocircuito** (*short-circuit evaluation*) en sus operadores lógicos `&&` y `||` para optimizar y proteger el flujo de control.

### 1. El Principio de Izquierda a Derecha
Las expresiones lógicas compuestas se evalúan de manera estrictamente secuencial desde el operando izquierdo hacia el derecho. 
* **Operador Conjunción (`&&`):** Si el lado izquierdo resulta ser `false`, el resultado global es inevitablemente falso. Por tanto, la JVM aplica un **cortocircuito** y omite por completo la evaluación del lado derecho.
* **Operador Disyunción (`||`):** Si el lado izquierdo resulta ser `true`, el resultado global es inevitablemente verdadero, deteniendo la evaluación subsiguiente.

### 2. Patrones Defensivos contra Excepciones
* **Prevención de `NullPointerException`:** Al evaluar propiedades o métodos de objetos, colocar siempre la validación de no nulidad a la izquierda (`objeto != null && objeto.hacerAlgo()`) garantiza que los objetos nulos nunca alcancen la invocación del método.
* **Prevención de `ArithmeticException`:** Proteger las divisiones colocando la comprobación de divisores no nulos antes de la operación aritmética (`divisor != 0 && valor / divisor > 1`).
