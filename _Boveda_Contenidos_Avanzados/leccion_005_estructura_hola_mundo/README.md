# Lección 005: Anatomía del método main y Estructura de Hola Mundo

> **Estado:** 🟢 Desplegado / Código Autodidacta
> **Unidad de Trabajo:** UT01 — Introducción a la Programación
> **Referencia:** Guía Maestra v3.0 (DAM 0485)

## 📚 Tratado Teórico y Pedagógico

La escritura de software funcional en Java requiere adherirse estrictamente a su modelo de arquitectura orientada a objetos, donde ningún fragmento de lógica o instrucción ejecutable puede existir de forma aislada fuera de una estructura de clase. 

Para lograr la correcta ejecución de una aplicación independiente, la ingeniería de software establece dos pilares fundamentales en este nivel:

**1. El Contenedor de Clase (`class`)**
En Java, la clase actúa como el molde o contenedor lógico primordial de nivel superior. Todo archivo fuente debe declarar una clase pública o de paquete cuyo nombre coincida exactamente con el identificador del fichero físico, garantizando la encapsulación estricta de atributos y métodos.

**2. El Punto de Entrada Obligatorio (`main`)**
La Máquina Virtual de Java (JVM) no ejecuta archivos al azar; busca de forma determinista un método específico que cumpla con la signatura estándar de entrada: `public static void main(String[] args)`. Cada modificador de esta signatura cumple una función arquitectónica vital:
* **`public`**: Otorga visibilidad universal para que la JVM pueda invocar el método desde fuera de la clase.
* **`static`**: Indica que el método pertenece a la clase en su conjunto y no requiere instanciar un objeto previo en memoria para ser ejecutado.
* **`void`**: Especifica que el método no devuelve ningún valor de retorno al sistema operativo al finalizar su ciclo de vida.
* **`String[] args`**: Recibe los parámetros opcionales enviados desde la línea de comandos en forma de array de cadenas.
