package UT01_Introduccion_Programacion.leccion_001_concepto_algoritmo_programa.src;

/**
 * BAD PATH: Violación de la propiedad de Finitud.
 * Algoritmo ambiguo sin condición de parada explícita que bloquea la ejecución.
 */
public class BadPath {
    public static void main(String[] args) {
        int contador = 0;
        // Anti-patrón: Bucle sin incremento de control (Falta de Finitud)
        while (contador < 10) {
            System.out.println("Procesando evento en bucle infinito...");
            // Omitir contador++ destruye la propiedad de Finitud en runtime
        }
    }
}