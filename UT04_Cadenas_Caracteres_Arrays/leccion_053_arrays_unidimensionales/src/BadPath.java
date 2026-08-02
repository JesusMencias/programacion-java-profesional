package UT04_Cadenas_Caracteres_Arrays.leccion_053_arrays_unidimensionales.src;

/**
 * Demostración del 'Array Index Overflow' (Error Off-by-one) y Alias por asignación directa.
 */
public class BadPath {

    public static void main(String[] args) {
        int[] arrayA = new int[100];
        int[] arrayB = {10, 20, 30, 40, 50};

        // Anti-patrón 1: Asignación por Alias (Punteros duplicados al mismo bloque en Heap)
        arrayA = arrayB; // arrayA abandona su bloque de 100 espacios y apunta a arrayB

        // Modificar arrayA afecta directamente a arrayB
        arrayA[0] = 999;
        System.out.println("Valor en arrayB[0] mutado por alias: " + arrayB[0]);

        // Anti-patrón 2: Acceso inclusivo al índice .length (Off-by-one)
        try {
            for (int i = 0; i <= arrayA.length; i++) { // <= provoca desbordamiento
                System.out.println(arrayA[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ALERTA BAD PATH: " + e.toString());
        }
    }
}