package UT01_Introduccion_Programacion.leccion_007_operadores.src;

/**
 * 007. Operadores en Java
 * Objetivo: Demostrar el uso de operadores aritméticos, relacionales, lógicos y de asignación.
 */
public class OperadoresDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * EVALUACIÓN Y APLICACIÓN DE OPERADORES
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE OPERADORES EN JAVA");
        System.out.println("==================================================");

        try {
            // 1. Aritméticos
            int a = 10, b = 3;
            int suma = a + b;
            int modulo = a % b; // Resto de la división

            // 2. Relacionales
            boolean esMayor = (a > b);

            // 3. Lógicos
            boolean condicionA = true;
            boolean condicionB = false;
            boolean resultadoLogico = condicionA && !condicionB;

            // 4. Incremento
            int contador = 5;
            contador++; // Incrementa a 6

            // Salida de consola estructurada
            System.out.println("-> Suma (10 + 3):         " + suma);
            System.out.println("-> Módulo (10 % 3):       " + modulo);
            System.out.println("-> Relacional (10 > 3):   " + esMayor);
            System.out.println("-> Lógico (true && !false):" + resultadoLogico);
            System.out.println("-> Incremento contador:   " + contador);

        } catch (ArithmeticException e) {
            System.err.println("[ERROR MATEMÁTICO] Operación inválida detectada: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operadores: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Dividir dos variables de tipo entero (ej. 5 / 2) 
        // devolverá un resultado entero truncado (2), descartando los decimales. 
        // Para obtener precisión decimal, al menos uno de los operandos debe ser casteado a double.
    }
}
