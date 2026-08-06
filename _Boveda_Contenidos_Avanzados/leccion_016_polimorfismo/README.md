# Lección 016: Polimorfismo y Sobrescritura de Métodos (`@Override`) en Java

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la Programación Orientada a Objetos avanzada, el concepto de herencia adquiere su máxima expresión cuando se combina con la capacidad de transformar y especializar el comportamiento de los métodos heredados. A este principio se le conoce como **Polimorfismo**.

El polimorfismo se estructura bajo los siguientes pilares en Java:

**1. Sobrescritura de Métodos (`Method Overriding`)**
Cuando una subclase hereda un método de su superclase, puede optar por redefinir el cuerpo de ese método para adaptarlo a su lógica específica, manteniendo exactamente la misma firma (nombre, tipo de retorno y parámetros).

**2. La Anotación `@Override`**
Es una directiva de metadatos obligatoria que indica al compilador que verifique la existencia del método original en la superclase, previniendo errores humanos de tipeo.

**3. Ligadura Dinámica (*Dynamic Binding*)**
Al invocar un método sobrescrito mediante una referencia de la superclase, Java evalúa el tipo real del objeto instanciado en tiempo de ejecución, ejecutando la versión especializada correspondiente de forma automática.
