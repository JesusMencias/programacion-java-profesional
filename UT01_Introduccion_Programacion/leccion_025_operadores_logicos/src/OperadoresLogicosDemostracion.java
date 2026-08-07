package UT01_Introduccion_Programacion.leccion_025_operadores_logicos.src;

/**
 * 025. Operadores lógicos (&&, ||, !), tablas de verdad y Leyes de De Morgan
 * Objetivo: Demostrar empíricamente las tablas de verdad lógicas y la equivalencia 
 *           de refactorización mediante las Leyes de De Morgan.
 */
public class OperadoresLogicosDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: OPERADORES LÓGICOS Y DE MORGAN");
        System.out.println("==================================================");

        try {
            boolean a = true;
            boolean b = false;

            // 1. Operadores lógicos fundamentales
            System.out.println("-> a (true) && b (false): " + (a && b)); // false
            System.out.println("-> a (true) || b (false): " + (a || b)); // true
            System.out.println("-> !a (NOT true):         " + (!a));     // false

            // 2. Leyes de De Morgan
            // !(A && B) equivale a !A || !B
            boolean expresionOriginal1 = !(a && b);
            boolean expresionDeMorgan1 = !a || !b;

            System.out.println("\n[LEY DE DE MORGAN 1]:");
            System.out.println("   !(A && B) = " + expresionOriginal1);
            System.out.println("   !A || !B  = " + expresionDeMorgan1);
            System.out.println("   ¿Son equivalentes?: " + (expresionOriginal1 == expresionDeMorgan1));

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operadores lógicos: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
