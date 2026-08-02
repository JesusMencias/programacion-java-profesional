package UT01_Introduccion_Programacion.leccion_010_anatomia_main.src;

/**
 * DEMOSTRACIÓN DE CLEAN CODE: Manejo Defensivo de CLI Args and Demostración de Heap.
 */
public class CleanSolution {

    public static void main(String[] args) {
        System.out.println("=== DIAGNÓSTICO DEFENSIVO DE PARÁMETROS DE ENTRADA ===");

        // 1. Validación defensiva de la longitud del array inyectado por la JVM
        if (args.length == 0) {
            System.out.println("[INFO] No se han proporcionado argumentos desde la CLI.");
            System.out.println("Uso: java CleanSolution <entorno> <modo_debug>");
            System.out.println("Ejemplo: java CleanSolution produccion true\n");
        } else {
            System.out.println("Argumentos recibidos: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("  args[" + i + "] -> " + args[i]);
            }
        }

        // 2. Demostración del Reto Técnico (Reasignación de Referencia en Heap)
        System.out.println("\n--- DEMOSTRACIÓN DE ARQUITECTURA DE MEMORIA HEAP ---");
        System.out.println("Referencia original 'args' apuntaba al array CLI de tamaño: " + args.length);
        
        // Reasignación del puntero: 'args' pasa a apuntar a una nueva estructura
        args = new String[10]; 
        System.out.println("Nueva referencia 'args' apunta a nuevo bloque en Heap de tamaño: " + args.length);
        System.out.println("Nota: El array original de la CLI queda huérfano para el Garbage Collector.");
    }
}