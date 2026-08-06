# Lección 004: Instalación del JDK y Variables de Entorno

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

La ejecución de software escrito en Java requiere un entorno de ejecución especializado que traduzca el código intermedio a instrucciones comprensibles por el hardware del sistema operativo. Sin embargo, para que las herramientas de compilación y ejecución operen de forma transparente, la infraestructura del sistema operativo debe estar configurada con precisión milimétrica mediante variables de entorno globales.

Para lograr esto, la ingeniería de software se apoya en tres elementos estructurales fundamentales:

**1. El Kit de Desarrollo de Java (JDK)**
Es el contenedor integral diseñado para desarrolladores. Contiene absolutamente todo lo necesario no solo para ejecutar aplicaciones (tareas propias del JRE y la JVM), sino para crearlas y compilarlas desde cero: incluye el compilador (`javac`), el empaquetador, depuradores y la documentación oficial de la API estándar.

**2. La Variable de Entorno `JAVA_HOME`**
Es una directiva a nivel de sistema operativo que apunta de forma exclusiva al directorio raíz donde se encuentra instalado el JDK. Su propósito es servir como referencia estandarizada para múltiples herramientas de desarrollo, IDEs y servidores de aplicaciones (como Maven, Gradle o Tomcat), permitiéndoles localizar el entorno Java de manera automática sin depender de rutas relativas frágiles.

**3. La Inyección en el `PATH` del Sistema**
El `PATH` es la variable de entorno que define las rutas donde el sistema operativo busca ejecutables cuando se introduce un comando en la terminal. Al añadir la ruta absoluta de la carpeta `bin` del JDK dentro del `PATH`, el sistema se vuelve capaz de reconocer y ejecutar comandos globales como `javac` y `java` desde cualquier directorio de trabajo, evitando errores de comando no encontrado.
