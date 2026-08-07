package UT01_Introduccion_Programacion.leccion_027_operadores_bitwise.src;

/**
 * 027. Operadores bit a bit (bitwise) y desplazamientos (<<, >>, >>>) [EXTRA]
 * Objetivo: Demostrar operaciones a nivel de bits y desplazamientos aritméticos 
 *           sobre representaciones binarias enteras en Java.
 */
public class BitwiseDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: OPERADORES BITWISE Y DESPLAZAMIENTOS");
        System.out.println("==================================================");

        try {
            int a = 5;  // En binario (32 bits): 00000000 00000000 00000000 00000101
            int b = 3;  // En binario (32 bits): 00000000 00000000 00000000 00000011

            // 1. Operadores Bitwise Básicos
            int resultadoAnd = a & b; // 1 (0001 en binario)
            int resultadoOr = a | b;  // 7 (0111 en binario)
            int resultadoXor = a ^ b; // 6 (0110 en binario)

            System.out.println("-> a & b (AND): " + resultadoAnd);
            System.out.println("-> a | b (OR):  " + resultadoOr);
            System.out.println("-> a ^ b (XOR): " + resultadoXor);

            // 2. Operadores de Desplazamiento (Shift)
            // Desplazamiento a la izquierda (<<): Multiplica por 2^n (5 * 2^2 = 20)
            int desplazamientoIzq = a << 2; 

            // Desplazamiento a la derecha con signo (>>): Divide entre 2^n (5 / 2^1 = 2)
            int desplazamientoDer = a >> 1; 

            System.out.println("\n[DESPLAZAMIENTOS]:");
            System.out.println("-> a << 2 (Multiplicación por 4): " + desplazamientoIzq);
            System.out.println("-> a >> 1 (División entera por 2):  " + desplazamientoDer);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operadores bitwise: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
