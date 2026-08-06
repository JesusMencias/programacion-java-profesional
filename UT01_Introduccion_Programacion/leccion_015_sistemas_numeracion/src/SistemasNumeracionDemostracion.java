package UT01_Introduccion_Programacion.leccion_015_sistemas_numeracion.src;

/**
 * 015. Sistemas de numeración: binario (0b), octal, decimal y hexadecimal (0x)
 * Objetivo: Demostrar la declaración y evaluación en consola de literales numéricos 
 *           expresados en diferentes bases dentro del lenguaje Java.
 */
public class SistemasNumeracionDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: SISTEMAS DE NUMERACIÓN EN JAVA");
        System.out.println("==================================================");

        try {
            // 1. Sistema Decimal (Base 10) - Sin prefijo
            int decimalValor = 42;

            // 2. Sistema Binario (Base 2) - Prefijo 0b
            int binarioValor = 0b101010; // Equivale a 42 en decimal

            // 3. Sistema Octal (Base 8) - Prefijo 0 inicial
            int octalValor = 052; // Equivale a 42 en decimal (5 * 8^1 + 2 * 8^0)

            // 4. Sistema Hexadecimal (Base 16) - Prefijo 0x
            int hexValor = 0x2A; // Equivale a 42 en decimal (2 * 16^1 + 10 * 16^0)

            // Salidas formateadas en consola
            System.out.println("-> Decimal (Base 10):      " + decimalValor);
            System.out.println("-> Binario (0b101010):     " + binarioValor);
            System.out.println("-> Octal (052):            " + octalValor);
            System.out.println("-> Hexadecimal (0x2A):     " + hexValor);

            System.out.println("\n[EVALUACIÓN]: Todos los literales almacenan exactamente");
            System.out.println("el mismo valor binario de 32 bits en la memoria RAM.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar sistemas de numeración: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
