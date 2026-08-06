package UT01_Introduccion_Programacion.leccion_004_instalacion_jdk.src;

/**
 * 004. Instalación del JDK y Variables de Entorno
 * Objetivo: Comprobar programáticamente que las rutas del JDK y el runtime están accesibles.
 */
public class VerificadorEntorno {

    public static void main(String[] args) {
        /*
         * ==========================================
         * VALIDACIÓN LÓGICA DEL ENTORNO DE EJECUCIÓN
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" VALIDACIÓN DE INSTALACIÓN Y PATH DEL JDK");
        System.out.println("==================================================");

        try {
            String javaHome = System.getenv("JAVA_HOME");
            String javaVersion = System.getProperty("java.version");
            String javaVendor = System.getProperty("java.vendor");

            if (javaHome == null || javaHome.isEmpty()) {
                System.out.println("[ALERTA] La variable de entorno JAVA_HOME no está configurada.");
            } else {
                System.out.println("[OK] JAVA_HOME detectado en: " + javaHome);
            }

            System.out.println("-> Versión activa: " + javaVersion);
            System.out.println("-> Proveedor:     " + javaVendor);
            
        } catch (SecurityException e) {
            System.err.println("[ERROR CRÍTICO] Seguridad denegada al leer variables de entorno.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo inesperado en la validación: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Si intentas compilar este archivo ejecutando 'javac'
        // sin haber configurado previamente el PATH de tu sistema operativo con la 
        // ruta bin del JDK, la terminal devolverá el error: "javac no se reconoce como un comando interno o externo".
    }
}
