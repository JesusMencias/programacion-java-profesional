package UT01_Introduccion_Programacion.leccion_008_classloader_java21.src;

/**
 * 008. ClassLoader en Java 21: Bootstrap -> Platform -> Application
 * Objetivo: Demostrar empíricamente la jerarquía de cargadores de clases de la JVM
 *           inspeccionando el ClassLoader que cargó las clases del sistema y de usuario.
 */
public class ClassLoaderDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: JERARQUÍA DE CLASSLOADERS EN JAVA 21");
        System.out.println("==================================================");

        try {
            // 1. ClassLoader de nuestra propia clase de usuario (Application ClassLoader)
            Class<?> claseActual = ClassLoaderDemostracion.class;
            ClassLoader appClassLoader = claseActual.getClassLoader();
            System.out.println("-> [Application ClassLoader]: " + appClassLoader);

            // 2. ClassLoader de plataforma (Platform ClassLoader)
            ClassLoader platformClassLoader = appClassLoader.getParent();
            System.out.println("-> [Platform ClassLoader]:    " + platformClassLoader);

            // 3. ClassLoader raíz del núcleo (Bootstrap ClassLoader - Retorna null por ser nativo)
            ClassLoader bootstrapClassLoader = platformClassLoader != null ? platformClassLoader.getParent() : null;
            System.out.println("-> [Bootstrap ClassLoader]:   " + bootstrapClassLoader + " (Nativo de la JVM)");

            // 4. Verificación de clases del núcleo (ej. String)
            ClassLoader classLoaderDeString = String.class.getClassLoader();
            System.out.println("-> [ClassLoader de java.lang.String]: " + classLoaderDeString);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al inspeccionar la jerarquía de cargadores: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
