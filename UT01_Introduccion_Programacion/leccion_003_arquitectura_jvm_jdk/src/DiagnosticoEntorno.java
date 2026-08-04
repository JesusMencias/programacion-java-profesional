package UT01_Introduccion_Programacion.leccion_003_arquitectura_jvm_jdk.src;

/**
 * 003. Arquitectura de Ejecución (JVM, JRE, JDK)
 * Qué: Identificar mediante código la Máquina Virtual de Java que está ejecutando nuestro Bytecode.
 */
public class DiagnosticoEntorno {
    
    public static void main(String[] args) {
        ejecutarDiagnostico();
    }
    
    /**
     * Qué: Extrae e imprime las propiedades del entorno de ejecución (OS, JVM, JDK).
     * Incluye validación de nulos y control de excepciones de seguridad.
     */
    private static void ejecutarDiagnostico() {
        System.out.println("=== DIAGNÓSTICO DE ARQUITECTURA JAVA ===");
        
        try {
            // Extracción de metadatos de la JVM
            String nombreJVM = System.getProperty("java.vm.name");
            String versionJava = System.getProperty("java.version");
            String sistemaOperativo = System.getProperty("os.name");
            
            // Validación y despliegue de datos
            System.out.println("Sistema Operativo Host: " + (sistemaOperativo != null ? sistemaOperativo : "Desconocido"));
            System.out.println("Versión del JDK instalada: " + (versionJava != null ? versionJava : "Desconocida"));
            System.out.println("Máquina Virtual (JVM) en uso: " + (nombreJVM != null ? nombreJVM : "Desconocida"));
            
            // ⚠️ TRAMPA FRECUENTE: Creer que el archivo '.java' se ejecuta directamente.
            // Recuerda: javac compila a '.class' (Bytecode), y la orden 'java' invoca a la JVM 
            // para traducir ese Bytecode al Sistema Operativo Host mostrado arriba.
            
        } catch (SecurityException e) {
            System.err.println("[ERROR CRÍTICO] El gestor de seguridad bloqueó el acceso a las propiedades del sistema: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[ERROR INESPERADO] Fallo en la lectura del entorno de ejecución: " + e.getMessage());
        }
    }
}