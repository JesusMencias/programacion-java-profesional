package UT01_Introduccion_Programacion.leccion_028_precedencia_operadores.src;

/**
 * 028. Precedencia de operadores y uso de paréntesis
 * Objetivo: Demostrar cómo la precedencia implícita afecta el cálculo matemático 
 *           y cómo el uso de paréntesis permite controlar explícitamente el flujo de evaluación.
 */
public class PrecedenciaDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: PRECEDENCIA DE OPERADORES Y PARÉNTESIS");
        System.out.println("==================================================");

        try {
            // 1. Evaluación sin paréntesis (Precedencia implícita: * se ejecuta antes que +)
            int resultadoSinParentesis = 5 + 2 * 3; // 5 + 6 = 11

            // 2. Evaluación con paréntesis (Control explícito del orden)
            int resultadoConParentesis = (5 + 2) * 3; // 7 * 3 = 21

            System.out.println("-> Sin paréntesis (5 + 2 * 3):      " + resultadoSinParentesis);
            System.out.println("-> Con paréntesis ((5 + 2) * 3):    " + resultadoConParentesis);

            // Ejemplo lógico complejo
            boolean evaluacionLogica = true || false && false; // true || (false && false) -> true
            boolean evaluacionForzada = (true || false) && false; // true && false -> false

            System.out.println("\n[LÓGICA]:");
            System.out.println("-> Lógica implícita (true || false && false): " + evaluacionLogica);
            System.out.println("-> Lógica forzada ((true || false) && false): " + evaluacionForzada);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar precedencia: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
