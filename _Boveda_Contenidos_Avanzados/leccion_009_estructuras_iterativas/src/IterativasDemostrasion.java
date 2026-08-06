package UT01_Introduccion_Programacion.leccion_009_estructuras_iterativas.src;

/**
 * 009. Estructuras de Control Iterativas
 * Objetivo: Demostrar el funcionamiento de los bucles while, do-while y for en Java.
 */
public class IterativasDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * EVALUACIÓN DE CICLOS ITERATIVOS
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE BUCLES E ITERACIONES EN JAVA");
        System.out.println("==================================================");

        try {
            // 1. Bucle for clásico (Indexado)
            System.out.println("-> Iniciando bucle for (1 al 3):");
            for (int i = 1; i <= 3; i++) {
                System.out.println("   Iteración número: " + i);
            }

            // 2. Bucle while (Pre-comprobación)
            System.out.println("-> Iniciando bucle while:");
            int contadorWhile = 2;
            while (contadorWhile > 0) {
                System.out.println("   Cuenta regresiva while: " + contadorWhile);
                contadorWhile--;
            }

            // 3. Bucle do-while (Post-comprobación)
            System.out.println("-> Iniciando bucle do-while:");
            boolean banderaEjecucion = false;
            do {
                System.out.println("   [EJECUCIÓN GARANTIZADA] Este mensaje se imprime al menos una vez.");
            } while (banderaEjecucion);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar las estructuras iterativas: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Olvidar actualizar la variable de control dentro de un bucle 
        // 'while' (por ejemplo, omitir el incremento) provocará un bucle infinito que congelará 
        // la ejecución del hilo de la aplicación y consumirá el 100% de la CPU.
    }
}
