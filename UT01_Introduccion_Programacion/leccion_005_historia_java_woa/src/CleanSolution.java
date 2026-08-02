package UT01_Introduccion_Programacion.leccion_005_historia_java_woa.src;

/**
 * Demostración del Principio WORA (Write Once, Run Anywhere).
 */
public class CleanSolution {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        System.out.println("=== PRINCIPIO WORA EN EJECUCIÓN ===");
        System.out.println("Sistema Operativo Anfitrión: " + osName);
        System.out.println("Entorno de Ejecución JVM   : " + javaVersion);
        System.out.println("El mismo .class se ejecuta intacto en cualquier SO con JVM.");
    }
}