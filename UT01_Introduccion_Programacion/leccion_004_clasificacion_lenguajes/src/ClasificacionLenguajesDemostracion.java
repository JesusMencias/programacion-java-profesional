package UT01_Introduccion_Programacion.leccion_004_clasificacion_lenguajes.src;

/**
 * 004. Clasificación de lenguajes y propiedades de ejecución
 * Objetivo: Demostrar cómo Java expone propiedades del sistema operativo y de la JVM 
 *           como reflejo de su arquitectura de alto nivel e híbrida.
 */
public class ClasificacionLenguajesDemostracion {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: MOTOR DE EJECUCIÓN Y ENTORNO");
        System.out.println("==================================================");

        try {
            String versionJava = System.getProperty("java.version");
            String sistemaOperativo = System.getProperty("os.name");
            String arquitectura = System.getProperty("os.arch");
            long memoriaLibre = Runtime.getRuntime().freeMemory() / (1024 * 1024);

            System.out.println("-> [Alto Nivel] Sistema Operativo: " + sistemaOperativo + " (" + arquitectura + ")");
            System.out.println("-> [JVM Híbrida] Versión de Java:   " + versionJava);
            System.out.println("-> [Gestión RAM] Memoria Libre JVM: " + memoriaLibre + " MB");
            
            System.out.println("\n[INFO ARCHITECTURAL]: El Bytecode de esta clase se ejecuta gracias");
            System.out.println("a la traducción dinámica de la JVM sobre el hardware subyacente.");
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al consultar propiedades del entorno: " + e.getMessage());
        }
        System.out.println("==================================================");
    }
}
