# Lección 010: Introducción a los Arrays Unidimensionales en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Cuando un sistema informático necesita procesar colecciones homogéneas de datos —como una lista de calificaciones, temperaturas o identificadores— el uso de variables individuales independientes se vuelve inviable e inescalable. Para resolver esto, la ingeniería de software utiliza estructuras de datos lineales conocidas como **arrays o arreglos**.

En Java, un array presenta las siguientes características arquitectónicas fundamentales:

**1. Homogeneidad y Tamaño Estático**
Un array es un contenedor de objetos o tipos primitivos que almacena exclusivamente datos del mismo tipo declarado. Una vez que un array es instanciado en memoria, su tamaño se vuelve completamente estático e inmutable.

**2. Indexación Base Cero (`Zero-based Indexing`)**
Los elementos se almacenan en posiciones de memoria contiguas. El acceso a cada elemento individual se realiza mediante un índice numérico entero. El primer elemento ocupa siempre la posición `0`, y el último el índice `n - 1`.

**3. La Propiedad `length` y Seguridad de Límites**
Para prevenir accesos erróneos, Java incorpora de forma nativa la propiedad pública `length`, la cual expone el número exacto de elementos. Intentar acceder fuera de este rango provoca la excepción `ArrayIndexOutOfBoundsException`.
