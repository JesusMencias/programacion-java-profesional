package UT01_Introduccion_Programacion.leccion_004_instalacion_jdk_variables_entorno.src;

/**
 * 004. Instalación del JDK y Variables de Entorno
 * Objetivo: Comprobar programáticamente que las rutas del JDK y el runtime están accesibles.
 */
public class VerificadorEntorno {

    /**
     * Punto de entrada principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" VALIDACIÓN DE INSTALACIÓN Y PATH DEL JDK");
        System.out.println("==================================================");

        try {
            validarVariablesEntorno();
        } catch (SecurityException e) {
            System.err.println("[ERROR CRÍTICO] Seguridad denegada al leer variables de entorno.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo inesperado en la validación: " + e.getMessage());
        }
    }

    /**
     * Valida y muestra los directorios críticos de Java en el sistema.
     */
    private static void validarVariablesEntorno() {
        String javaHome = System.getenv("JAVA_HOME");
        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");

        if (javaHome == null || javaHome.isEmpty()) {
            System.out.println("[ALERTA] La variable de entorno JAVA_HOME no está configurada correctamente.");
        } else {
            System.out.println("[OK] JAVA_HOME detectado en: " + javaHome);
        }

        System.out.println("-> Versión activa: " + javaVersion);
        System.out.println("-> Proveedor:     " + javaVendor);
        System.out.println("==================================================");
    }
}
