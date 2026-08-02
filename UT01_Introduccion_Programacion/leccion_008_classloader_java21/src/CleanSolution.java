package UT01_Introduccion_Programacion.leccion_008_classloader_java21.src;

/**
 * Demostración de la Jerarquía de ClassLoaders en Java 21 LTS (Modular).
 */
public class CleanSolution {
    public static void main(String[] args) {
        System.out.println("=== JERARQUÍA NATIVA DE CLASSLOADERS (JAVA 21) ===");

        // Application ClassLoader
        ClassLoader appClassLoader = CleanSolution.class.getClassLoader();
        System.out.println("1. Application ClassLoader: " + appClassLoader);

        // Platform ClassLoader (Sustituye al antiguo Extension ClassLoader de Java 8)
        ClassLoader platformClassLoader = appClassLoader.getParent();
        System.out.println("2. Platform ClassLoader   : " + platformClassLoader);

        // Bootstrap ClassLoader (Escrito en C/C++, se representa como null en la API Java)
        ClassLoader bootstrapClassLoader = platformClassLoader.getParent();
        System.out.println("3. Bootstrap ClassLoader  : " + bootstrapClassLoader + " (Núcleo JVM)");
    }
}