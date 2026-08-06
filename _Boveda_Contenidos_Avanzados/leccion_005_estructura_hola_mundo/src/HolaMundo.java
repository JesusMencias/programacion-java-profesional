package UT01_Introduccion_Programacion.leccion_005_estructura_hola_mundo.src;

/**
 * 005. Anatomía del método main y Estructura de Hola Mundo
 * Objetivo: Demostrar la estructura encapsulada de una clase y el punto de entrada de la JVM.
 */
public class HolaMundo {

    public static void main(String[] args) {
        /*
         * ==========================================
         * EJECUCIÓN DE SALIDA ESTÁNDAR POR CONSOLA
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" ¡Hola, Autodidacta! Bienvenido a la ingeniería Java.");
        System.out.println("==================================================");

        try {
            // Verificación formal del entorno de hilos y argumentos
            int argumentosRecibidos = args.length;
            System.out.println("-> Argumentos de consola detectados: " + argumentosRecibidos);
            
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar los argumentos de entrada: " + e.getMessage());
        }

        // ⚠️ TRAMPA FRECUENTE: Si omites el modificador 'static' en el método main,
        // la JVM compilará el archivo pero al intentar ejecutarlo lanzará un error crítico 
        // indicando que no se encuentra el método principal en la clase especificada.
    }
}
