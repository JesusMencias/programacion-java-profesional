# Lección 030: Entrada/salida por consola: System.out, System.err y Scanner completo

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

La interacción con el entorno operativo a través de la consola se estructura mediante flujos de entrada y salida estándar en Java.

### 1. Canales de Salida: `System.out` y `System.err`
* **`System.out`:** Canal estándar optimizado para la entrega de resultados normales y datos limpios del programa.
* **`System.err`:** Canal independiente dedicado exclusivamente al reporte de errores y diagnósticos. Su búfer separado garantiza que las alertas no se alteren con los flujos de datos regulares.

### 2. Captura Interactiva con `Scanner`
La clase `Scanner` facilita el parseo de flujos de entrada provenientes del teclado (`System.in`). 
* **La Trampa del Búfer (*Newline Trap*):** Al alternar métodos de lectura numérica (como `nextInt()`) con lecturas de cadenas (`nextLine()`), el carácter de salto de línea (`
`) introducido al pulsar *Enter* permanece en el búfer. Es obligatorio consumir dicho carácter pendiente mediante un `nextLine()` intermedio para evitar saltos en la captura de texto subsiguiente.
