package UT01_Introduccion_Programacion.leccion_009_instalacion_entorno_ide.src;

/**
 * DEMOSTRACIÓN DE CLEAN CODE: Diagnóstico de Propiedades de Entorno y Runtime.
 * Verifica que la JVM en ejecución corresponde al JDK 21 LTS de desarrollo.
 */
public class CleanSolution {

    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaHome = System.getProperty("java.home");

        System.out.println("=== VERIFICACIÓN DEL ARSENAL DE DESARROLLO (JDK 21 LTS) ===");
        System.out.println("Versión de Java (JVM)   : " + javaVersion);
        System.out.println("Proveedor del SDK       : " + javaVendor);
        System.out.println("Ruta Runtime (JAVA_HOME): " + javaHome);

        if (javaVersion.startsWith("21")) {
            System.out.println("\n[ESTADO OK] Entorno de ingeniería configurado correctamente para Java 21 LTS.");
        } else {
            System.out.println("\n[ADVERTENCIA] Versión detectada diferente de Java 21. Revisa tus variables JAVA_HOME y PATH.");
        }
    }
}