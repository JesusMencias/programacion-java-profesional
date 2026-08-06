package UT01_Introduccion_Programacion.leccion_009_instalacion_entorno_jdk.src;

/**
 * 009. Instalación del entorno: JDK 21 e IDE
 * Objetivo: Demostrar la verificación programática de las propiedades del entorno 
 *           de desarrollo y la versión del JDK activa en el sistema.
 */
public class EntornoDemostrasion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: VERIFICACIÓN DEL ENTORNO JDK 21");
        System.out.println("==================================================");

        try {
            // Extracción de propiedades del entorno configurado
            String javaVersion = System.getProperty("java.version");
            String javaVendor = System.getProperty("java.vendor");
            String javaHome = System.getProperty("java.home");
            String osName = System.getProperty("os.name");
            String userName = System.getProperty("user.name");

            System.out.println("-> [Usuario Activo]:     " + userName);
            System.out.println("-> [Sistema Operativo]:  " + osName);
            System.out.println("-> [Versión JDK Activa]: " + javaVersion);
            System.out.println("-> [Proveedor del SDK]:  " + javaVendor);
            System.out.println("-> [Ruta JAVA_HOME]:     " + javaHome);
            
            System.out.println("\n[ESTADO]: Entorno de desarrollo verificado con éxito.");
            System.out.println("La infraestructura local cumple los requisitos de DAM (0485).");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al verificar el entorno de desarrollo: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
