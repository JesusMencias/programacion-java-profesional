# Lección 002: Representación de algoritmos: diagramas de flujo y pseudocódigo

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Con anterioridad a la escritura directa de código fuente en un entorno de desarrollo, la ingeniería de software profesional exige la modelización abstracta de la lógica mediante herramientas estandarizadas de representación. Escribir código sin un diseño previo equivale a construir una infraestructura sin planos arquitectónicos: el resultado es un sistema frágil, altamente acoplado y propenso a errores catastróficos.

Para evitar esto, la industria utiliza dos herramientas fundamentales de abstracción algorítmica:

**1. Diagramas de Flujo (Simbología ISO Universal)**
Constituyen una representación gráfica y matemática del flujo de control de un programa. Emplean un lenguaje visual estandarizado internacionalmente compuesto por formas geométricas con un significado semántico unívoco:
* **El Óvalo (Terminal):** Denota las fronteras absolutas del algoritmo, marcando estrictamente el Inicio y el Fin.
* **El Rectángulo (Proceso):** Representa operaciones internas, como cálculos matemáticos, transformaciones de datos o asignaciones de estado.
* **El Rombo (Decisión):** Es el motor de la lógica condicional. Representa una bifurcación booleana (Verdadero / Falso) donde el flujo del programa toma caminos distintos según una condición.
* **El Paralelogramo (Entrada/Salida):** Simboliza la interacción con el exterior, como la lectura de datos del usuario o la impresión de información en pantalla.

Estas piezas geométricas se conectan mediante líneas de flujo direccional que actúan como la "gravedad lógica" del programa. En la ingeniería de software estructurada, está categóricamente prohibido el cruce arbitrario de estas líneas para prevenir el desarrollo del infame "código espagueti".

**2. Pseudocódigo Puro (Abstracción Agnóstica)**
El pseudocódigo es una representación textual estructurada a medio camino entre el lenguaje natural humano y la sintaxis rígida de un lenguaje de programación. Su objetivo es permitir que el raciocinio humano procese la arquitectura del problema sin la distracción de las restricciones gramaticales de un compilador (como los puntos y comas, o las llaves de bloque). 
Utiliza categorías tipadas genéricas (NUMERO, TEXTO, LOGICO) y emplea una indentación estricta (sangrías visuales) para delimitar los bloques lógicos. Actúa como el puente cognitivo perfecto, garantizando que el desarrollador comprenda el "qué" debe hacer el sistema antes de preocuparse por el "cómo" se escribe en la sintaxis específica de Java.
