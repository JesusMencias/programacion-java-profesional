# Lección 020: Arrays Multidimensionales y Matrices Irregulares (*Jagged*) en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT04 — Cadenas de caracteres y arrays
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Cuando un programa necesita modelar información estructurada en dos o más dimensiones (como coordenadas geográficas, tableros de juego u hojas de cálculo), los arrays unidimensionales resultan insuficientes. La ingeniería de software utiliza entonces **arrays multidimensionales**.

En Java, el tratamiento de estas estructuras se rige bajo los siguientes principios arquitectónicos:

**1. Naturaleza de los Arrays Multidimensionales (Matrices)**
En Java, las matrices no son bloques contiguos de memoria bidimensional pura, sino que se implementan formalmente como **"arrays de arrays"**[cite: 1]. Un array bidimensional es un array unidimensional donde cada posición almacena la referencia a otro array que actúa como fila.

**2. Matrices Regulares e Irregulares (*Jagged Arrays*)**
* **Matrices Regulares:** Todas las filas poseen exactamente el mismo número de columnas, formando una cuadrícula uniforme.
* **Matrices Irregulares (*Jagged*):** Las filas tienen longitudes de columnas completamente independientes entre sí[cite: 1], optimizando el consumo de memoria RAM.

**3. Recorrido Mediante Bucles Anidados**
Para procesar cada celda de una matriz, se emplean bucles `for` anidados[cite: 1]: el bucle externo recorre las filas (`matriz.length`) y el interno recorre las columnas de forma dinámica (`matriz[i].length`).
