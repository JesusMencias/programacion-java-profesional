package UT01_Introduccion_Programacion.leccion_003_arquitectura_jvm_jdk.src;

/**
 * 003. Arquitectura de la JVM, JRE y el JDK
 * Objetivo: Inspeccionar y validar de forma programática las propiedades del entorno de ejecución de Java.
 */
public class DiagnosticoEntorno {

    /**
     * Punto de entrada principal de la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" AUDITORÍA TÉCNICA: ENTORNO DE EJECUCIÓN JAVA");
        System.out.println("==================================================");

        try {
            evaluarPropiedadesSistema();
        } catch (SecurityException e) {
            System.err.println("[ERROR CRÍTICO] Seguridad: Acceso restringido a las propiedades del sistema.");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("[ERROR INESPERADO] Fallo durante la evaluación del entorno: " + e.getMessage());
        }
    }

    /**
     * Extrae e imprime las propiedades clave de la JVM y el sistema operativo de forma segura.
     */
    private static void evaluarPropiedadesSistema() {
        String versionJava = System.getProperty("java.version");
        String vendorJava = System.getProperty("java.vendor");
        String homeJava = System.getProperty("java.home");
        String sistemaOperativo = System.getProperty("os.name");
        String arquitecturaOS = System.getProperty("os.arch");

        System.out.println("-> Versión de Java (JVM): " + versionJava);
        System.out.println("-> Proveedor del Entorno:  " + vendorJava);
        System.out.println("-> Directorio Home (JRE):  " + homeJava);
        System.out.println("-> Sistema Operativo:      " + sistemaOperativo);
        System.out.println("-> Arquitectura de Hardware: " + arquitecturaOS);
        System.out.println("==================================================");
        System.out.println("[ESTADO] Diagnóstico completado sin excepciones.");
    }
}