package UT01_Introduccion_Programacion.leccion_007_compilador_jit_memoria.src;

/**
 * 007. Compilador JIT (Just-In-Time) y gestión de memoria base
 * Objetivo: Demostrar la interacción con el subsistema de memoria de la JVM 
 *           (Heap y métricas de rendimiento en ejecución).
 */
public class CompiladorJitDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: GESTIÓN DE MEMORIA BASE Y JVM");
        System.out.println("==================================================");

        try {
            Runtime runtime = Runtime.getRuntime();

            // Métricas base de la memoria del Montículo (Heap)
            long memoriaTotalMB = runtime.totalMemory() / (1024 * 1024);
            long memoriaLibreMB = runtime.freeMemory() / (1024 * 1024);
            long memoriaUsadaMB = memoriaTotalMB - memoriaLibreMB;

            System.out.println("-> [Memoria Total Heap]: " + memoriaTotalMB + " MB");
            System.out.println("-> [Memoria Usada Heap]: " + memoriaUsadaMB + " MB");
            System.out.println("-> [Memoria Libre Heap]: " + memoriaLibreMB + " MB");
            
            System.out.println("\n[ARQUITECTURA JIT]: Los bloques ejecutados de forma repetitiva");
            System.out.println("en este proceso son optimizados al vuelo a código máquina nativo.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al consultar métricas de memoria: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
