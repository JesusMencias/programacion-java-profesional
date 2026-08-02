package UT01_Introduccion_Programacion.leccion_007_compilador_jit_memoria.src;

/**
 * Demostración de optimización JIT (Warmup Loop) e inspección de memoria.
 */
public class CleanSolution {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        
        long memoriaInicial = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria inicial utilizada: " + (memoriaInicial / 1024) + " KB");

        # Warmup loop: El compilador JIT detecta HotSpots y traduce a código máquina nativo
        long inicio = System.nanoTime();
        double suma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            suma += Math.sqrt(i);
        }
        long fin = System.nanoTime();

        System.out.println("Tiempo de ejecución (Optimizado JIT): " + (fin - inicio) / 1_000_000.0 + " ms");
    }
}