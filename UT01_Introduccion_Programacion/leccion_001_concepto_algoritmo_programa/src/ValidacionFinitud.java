package UT01_Introduccion_Programacion.leccion_001_concepto_algoritmo_programa.src;

/**
 * 001. Concepto de Algoritmo y Programa
 * Objetivo: Ilustrar cómo un algoritmo debe tener una condición de parada obligatoria (Finitud).
 */
public class ValidacionFinitud {
    
    public static void main(String[] args) {
        System.out.println("=== INICIANDO ALGORITMO DE SEGURIDAD ===");
        
        int limiteDeSeguridad = 3;
        int pasoActual = 1;
        
        // Simulación de un algoritmo finito y definido.
        while (pasoActual <= limiteDeSeguridad) {
            // Output: "Ejecutando paso seguro: [1, 2, 3]"
            System.out.println("Ejecutando paso seguro: " + pasoActual);
            pasoActual++; 
            
            // ⚠️ TRAMPA FRECUENTE: Si olvidamos la instrucción "pasoActual++", 
            // el algoritmo viola la regla de Finitud. Se creará un bucle infinito
            // que saturará los recursos del procesador y bloqueará el entorno de desarrollo.
        }
        
        // Output: "=== ALGORITMO FINALIZADO CORRECTAMENTE ==="
        System.out.println("=== ALGORITMO FINALIZADO CORRECTAMENTE ===");
    }
}