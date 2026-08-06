# Lección 010: Anatomía de public static void main(String[] args) línea a línea

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

Para que la Máquina Virtual de Java sepa por dónde iniciar la ejecución de un programa, requiere un punto de entrada exacto y un contrato estricto: `public static void main(String[] args)`.

**1. Modificadores de la Firma**
* **`public`:** Otorga visibilidad global permitiendo a la JVM invocar el método desde el exterior.
* **`static`:** Permite ejecutar el método directamente desde la clase sin necesidad de crear objetos previos.
* **`void`:** Indica que el método no devuelve ningún valor al finalizar.

**2. Identificador y Parámetros**
* **`main`:** Nombre contractual obligatorio e innegociable exigido por el motor de la JVM.
* **`String[] args`:** Vector de cadenas preparado para recibir parámetros opcionales desde la línea de comandos.
