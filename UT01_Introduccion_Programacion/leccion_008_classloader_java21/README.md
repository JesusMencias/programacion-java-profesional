# Lección 008: ClassLoader en Java 21: Bootstrap -> Platform -> Application

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

En la arquitectura avanzada de la Máquina Virtual de Java, las clases no se cargan de manera desorganizada. El subsistema **ClassLoader** busca, lee e indexa los binarios (`.class`) en memoria bajo demanda.

**1. El Modelo de Delegación Padre (*Parent-Delegation Model*)**
Las solicitudes de carga ascienden recursivamente hacia el cargador padre para garantizar que las clases del núcleo de Java no sean suplantadas por código de usuario malicioso.

**2. La Jerarquía de Cargadores en Java 21**
* **Bootstrap ClassLoader:** Cargador raíz escrito en código nativo (C/C++) que carga el núcleo del sistema (`java.base`). Retorna `null` en Java al ser nativo.
* **Platform ClassLoader:** Carga los módulos y extensiones estándar de la plataforma Java.
* **Application ClassLoader:** Carga las clases de usuario y las dependencias definidas en el *ClassPath*.
