package UT01_Introduccion_Programacion.leccion_010_arrays_unidimensionales.src;

/**
 * 010. Introducción a los Arrays Unidimensionales
 * Objetivo: Demostrar la declaración, instanciación, indexación y recorrido seguro de un array en Java.
 */
public class ArraysDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * DECLARACIÓN Y RECORRIDO DE ARRAYS
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE ARRAYS UNIDIMENSIONALES");
        System.out.println("==================================================");

        try {
            // 1. Declaración e inicialización directa de un array de enteros
            int[] calificaciones = {90, 85, 78, 92, 88};

            // 2. Acceso mediante índice base cero
            System.out.println("-> Primera calificación (Índice 0): " + calificaciones[0]);
            System.out.println("-> Capacidad total del array (length): " + calificaciones.length);

            // 3. Recorrido seguro utilizando la propiedad length
            System.out.println("-> Listado completo de calificaciones:");
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("   Posición [" + i + "] = " + calificaciones[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("[ERROR DE LÍMITES] Acceso fuera del rango válido del array: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar el array: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Intentar acceder a un elemento usando una condición de bucle 
        // con signo menor o igual (i <= array.length) provocará una excepción de desbordamiento 
        // (ArrayIndexOutOfBoundsException), ya que el último índice válido es estrictamente length - 1.
    }
}
