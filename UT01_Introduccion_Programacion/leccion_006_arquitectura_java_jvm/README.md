# Lección 006: Arquitectura Java: .java -> .class -> JVM, JRE y JDK

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la ingeniería de software, comprender la maquinaria interna que hace posible la ejecución de un programa es un requisito indispensable. El ecosistema de Java se estructura sobre una arquitectura en capas perfectamente delimitada.

**1. El Ciclo de Vida del Código: De `.java` a `.class`**
* **Código Fuente (`.java`):** Texto plano estructurado bajo la sintaxis de alto nivel de Java.
* **Compilador (`javac`):** Traduce el código fuente a un formato intermedio binario independiente de la plataforma conocido como **Bytecode** (`.class`).

**2. Los Tres Pilares del Ecosistema: JVM, JRE y JDK**
* **JVM (Java Virtual Machine):** Motor de ejecución central que traduce el Bytecode a código máquina nativo del procesador en tiempo real.
* **JRE (Java Runtime Environment):** Contiene la JVM, las librerías estándar y los binarios necesarios exclusivamente para **ejecutar** aplicaciones.
* **JDK (Java Development Kit):** Superconjunto completo destinado a desarrolladores; incluye el JRE más el compilador (`javac`), depurador y herramientas de ingeniería.
