# Lección 001: Concepto de Algoritmo y Programa

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En las ciencias de la computación, existe una frontera epistemológica fundamental entre el diseño lógico y la implementación física. La incapacidad para distinguir entre estos dos dominios es la causa principal de la fragilidad arquitectónica en el software desarrollado por programadores inexpertos, quienes tienden a escribir código directamente sin una fase previa de abstracción.

**El Algoritmo (El Plano Arquitectónico)**
Un **algoritmo** se define como una secuencia finita, rigurosa, ordenada e inequívoca de instrucciones diseñadas para resolver una clase específica de problemas computacionales. Su característica más importante es que es **agnóstico e independiente del lenguaje**: un algoritmo es un constructo matemático y lógico puro. No sabe qué es Java, ni Python, ni C++. 

Para que un procedimiento teórico alcance el estatus de algoritmo industrial aplicable en ingeniería, debe cumplir inquebrantablemente tres leyes universales:
1. **Precisión (Ausencia de Ambigüedad):** Cada instrucción debe estar formulada de manera exacta. La unidad aritmético-lógica del procesador carece absolutamente de heurística, intuición o sentido común para interpretar contextos. Una instrucción imprecisa conduce a un fallo de ejecución o a una corrupción de datos.
2. **Definibilidad (Determinismo Puro):** Frente a un conjunto idéntico de datos de entrada, el algoritmo debe computar inexorablemente el mismo resultado en todas y cada una de sus ejecuciones. Las variables de estado deben estar controladas para neutralizar el comportamiento estocástico (aleatorio).
3. **Finitud (Control de Recursos):** Todo proceso algorítmico debe culminar obligatoriamente tras la ejecución de un número finito y predecible de pasos. Un algoritmo que carece de una condición de terminación válida genera un "bucle infinito", consumiendo los ciclos del procesador y la memoria RAM hasta provocar un colapso del sistema (denegación de servicio a nivel de hardware).

**El Programa (La Ejecución Física)**
Mientras que el algoritmo es el concepto lógico, el **programa** es la materialización física y semántica de dicho concepto. Un programa informático es la traducción estricta del algoritmo a la sintaxis formal de un lenguaje de programación específico (en nuestro contexto, Java 21 LTS), permitiendo que el hardware interprete, compile y ejecute las instrucciones mediante pulsos eléctricos en la memoria y el procesador.
