# Lección 003: Arquitectura de Ejecución en Java (JVM, JRE, JDK y Bytecode)

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la ingeniería de software, escribir código es solo la mitad de la ecuación; la otra mitad es cómo el hardware interpreta esas instrucciones. Históricamente, los lenguajes se dividían en dos categorías: compilados (como C++, rápidos pero dependientes de la plataforma) e interpretados (como Python, multiplataforma pero más lentos). 

Java revolucionó la industria introduciendo una arquitectura híbrida basada en el principio **WORA (Write Once, Run Anywhere - Escribe una vez, ejecuta donde sea)**. Para lograr esto, Java segmenta su ecosistema en componentes estrictos:

**1. El Código Fuente y el Compilador (`javac`)**
El desarrollador escribe instrucciones legibles para el ser humano en archivos de texto con la extensión `.java`. Sin embargo, el procesador (CPU) no entiende este texto. Aquí interviene el compilador de Java (`javac`), pero a diferencia de otros lenguajes, no lo traduce a código máquina nativo, sino que lo traduce a un lenguaje intermedio llamado **Bytecode** (archivos `.class`).

**2. JVM (Java Virtual Machine)**
La Máquina Virtual de Java es el núcleo de esta arquitectura. Es un software que simula ser un ordenador físico. Su única función es tomar ese archivo `.class` (Bytecode) y traducirlo en tiempo real a las instrucciones nativas del sistema operativo donde se está ejecutando. Cada sistema operativo (Windows, macOS, Linux) tiene su propia JVM específica, pero todas entienden el mismo Bytecode universal.

**3. JRE (Java Runtime Environment)**
Es el entorno de ejecución. Contiene la JVM y todas las bibliotecas de clases base (librerías estándar) necesarias para que un programa Java ya compilado pueda funcionar. Un usuario final que solo quiere usar una aplicación hecha en Java, solo necesita instalar el JRE.

**4. JDK (Java Development Kit)**
Es el kit de herramientas para el ingeniero de software. Incluye el JRE (para ejecutar), la JVM, el compilador (`javac`), el empaquetador (`jar`) y herramientas de depuración. Como desarrolladores, instalamos obligatoriamente el JDK completo.
