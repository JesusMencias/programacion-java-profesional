package UT01_Introduccion_Programacion.leccion_006_arquitectura_java_jvm.src;

/**
 * 006. Arquitectura Java: .java -> .class -> JVM, JRE y JDK
 * Objetivo: Demostrar cómo Java interactúa en tiempo de ejecución con la especificación 
 *           de la Máquina Virtual y las propiedades del entorno operativo.
 */
public class ArquitecturaJavaDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: INSPECCIÓN DE LA JVM Y EL ENTORNO");
        System.out.println("==================================================");

        try {
            // Extracción de metadatos estructurales de la Máquina Virtual
            String specVersion = System.getProperty("java.vm.specification.version");
            String vmName = System.getProperty("java.vm.name");
            String vmVendor = System.getProperty("java.vm.vendor");
            String classpath = System.getProperty("java.class.path");

            System.out.println("-> [Motor Activo (JVM)]:  " + vmName);
            System.out.println("-> [Proveedor del Motor]: " + vmVendor);
            System.out.println("-> [Especificación VM]:   " + specVersion);
            System.out.println("-> [ClassPath Actual]:    " + (classpath.length() > 40 ? classpath.substring(0, 40) + "..." : classpath));
            
            System.out.println("\n[ARQUITECTURA]: El código fuente .java fue compilado a .class");
            System.out.println("y la JVM actual lo está interpretando/compilando en tiempo real.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al inspeccionar la arquitectura de la JVM: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
