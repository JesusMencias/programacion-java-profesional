package UT01_Introduccion_Programacion.leccion_021_operadores_aritmeticos.src;

/**
 * 021. Operadores aritméticos y asignación compuesta
 * Objetivo: Demostrar el uso de operadores aritméticos básicos (+, -, *, /, %),
 *           la trampa de la división entera y la simplificación por asignación compuesta.
 */
public class OperadoresAritmeticosDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: OPERADORES ARITMÉTICOS Y COMPUESTOS");
        System.out.println("==================================================");

        try {
            // 1. Operadores Aritméticos Básicos
            int a = 10;
            int b = 3;

            int suma = a + b;
            int resta = a - b;
            int multiplicacion = a * b;
            
            // División entera (se pierden los decimales porque ambos son int)
            int divisionEntera = a / b; 
            
            // División flotante forzada
            double divisionReal = (double) a / b;
            
            // Operador Módulo (Resto)
            int resto = a % b;

            System.out.println("-> Suma (10 + 3):          " + suma);
            System.out.println("-> Resta (10 - 3):         " + resta);
            System.out.println("-> Multiplicación (10 * 3):" + multiplicacion);
            System.out.println("-> División Entera (10/3): " + divisionEntera);
            System.out.println("-> División Real (10/3.0): " + divisionReal);
            System.out.println("-> Módulo Resto (10 % 3):  " + resto);

            // 2. Operadores de Asignación Compuesta
            System.out.println("\n[ASIGNACIÓN COMPUESTA]:");
            int puntaje = 50;
            System.out.println("   Puntaje inicial:       " + puntaje);

            puntaje += 10; // Equivalente a: puntaje = puntaje + 10;
            System.out.println("   Tras puntaje += 10:    " + puntaje);

            puntaje *= 2;  // Equivalente a: puntaje = puntaje * 2;
            System.out.println("   Tras puntaje *= 2:     " + puntaje);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operadores aritméticos: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
