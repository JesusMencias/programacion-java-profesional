# Lección 014: Encapsulamiento y Modificadores de Acceso en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En el desarrollo de software industrial, permitir que cualquier parte del código modifique libremente las variables internas de un objeto genera sistemas frágiles y propensos a la corrupción de datos. Para evitarlo, la Programación Orientada a Objetos establece el principio de **Encapsulamiento**.

El encapsulamiento consiste en reunir en una misma estructura los datos y los métodos que operan sobre ellos, restringiendo el acceso directo al interior del objeto mediante el uso de modificadores de visibilidad:

**1. Los Modificadores de Acceso**
Java define palabras reservadas específicas para controlar qué clases tienen permiso para ver o alterar un miembro:
* **`private`**: Acceso exclusivo dentro de la propia clase.
* **`public`**: Acceso universal para cualquier clase del proyecto.
* **`protected`**: Visibilidad en el mismo paquete y subclases.
* **Package-Private (Por defecto)**: Limitado exclusivamente a clases del mismo paquete.

**2. Métodos de Acceso Controlado (`Getters` y `Setters`)**
Para permitir una interacción segura con los atributos privados, la clase expone métodos públicos estandarizados: el método `get` para consultar el valor actual y el método `set` para modificarlo incorporando opcionalmente validaciones lógicas previas.
