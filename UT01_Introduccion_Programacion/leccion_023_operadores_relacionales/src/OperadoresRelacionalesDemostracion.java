package UT01_Introduccion_Programacion.leccion_023_operadores_relacionales.src;

/**
 * 023. Operadores relacionales
 * Objetivo: Demostrar operadores de comparación y la distinción crítica
 *           entre comparación de valores (primitivos) vs. referencias (objetos).
 */
public class OperadoresRelacionalesDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: OPERADORES RELACIONALES");
        System.out.println("==================================================");

        try {
            // 1. Primitivos (Comparación de valores)
            int a = 10;
            int b = 20;
            System.out.println("-> a(10) > b(20):  " + (a > b));   // false
            System.out.println("-> a(10) != b(20): " + (a != b));  // true

            // 2. Objetos / Tipos de referencia (El peligro del ==)
            String s1 = "hola";
            String s2 = new String("hola"); // Nuevo objeto en Heap

            System.out.println("\n[TRAMPA DE REFERENCIAS]:");
            System.out.println("-> Comparando referencias (s1 == s2): " + (s1 == s2)); // false (distintas direcciones)
            System.out.println("-> Comparando contenido (s1.equals(s2)): " + (s1.equals(s2))); // true (igual valor)

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operadores relacionales: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
