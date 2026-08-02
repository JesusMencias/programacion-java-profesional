# leccion_008_classloader_java21

> **Estado:** 🟢 Completado / Código Autodidacta (Guía Maestra v3.0)

## 📌 Jerarquía de Carga en Java 21 LTS (JDK 9+)
1. **Bootstrap ClassLoader:** Carga el núcleo (`java.lang`, `java.util`). Se muestra como `null` en la API.
2. **Platform ClassLoader:** Carga módulos de plataforma (*reemplaza al antiguo Extension ClassLoader de Java 8*).
3. **Application ClassLoader:** Carga el código de la aplicación y dependencias en el classpath.
