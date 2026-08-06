package UT01_Introduccion_Programacion.leccion_005_historia_java_wora.src;

/**
 * 005. Historia de Java y el principio Write Once, Run Anywhere (WORA)
 * Objetivo: Demostrar cómo Java expone el proveedor y el fabricante del motor de ejecución 
 *           actual, reflejando su independencia de plataforma.
 */
public class HistoriaJavaDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: FILOSOFÍA WORA Y ENTORNO JAVA");
        System.out.println("==================================================");

        try {
            // Extracción de metadatos de la JVM (Demostración de ejecución universal)
            String proveedorJava = System.getProperty("java.vendor");
            String urlProveedor = System.getProperty("java.vendor.url");
            String versionJava = System.getProperty("java.version");
            String nombreOS = System.getProperty("os.name");

            System.out.println("-> [WORA Activo] Sistema Operativo Host: " + nombreOS);
            System.out.println("-> [Motor JVM] Versión de Java:          " + versionJava);
            System.out.println("-> [Proveedor Oficial] Fabricante:        " + proveedorJava);
            System.out.println("-> [Sitio Web Oficial]:                 " + urlProveedor);
            
            System.out.println("\n[INFO HISTÓRICA]: Gracias al principio Write Once, Run Anywhere,");
            System.out.println("este mismo código compila a Bytecode una sola vez y corre en cualquier OS.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al consultar propiedades del entorno: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
