package UT04_Cadenas_Caracteres_Arrays.leccion_054_arrays_multidimensionales_matrices.src;

/**
 * Gestión de Matrices Irregulares (Ragged Arrays) con evaluación dinámica de límites.
 */
public class CleanSolution {

    public static void main(String[] args) {
        // Matriz irregular: 3 filas con diferente número de columnas
        int[][] matrizIrregular = new int[3][];
        matrizIrregular[0] = new int[2]; // Fila 0 tiene 2 columnas
        matrizIrregular[1] = new int[4]; // Fila 1 tiene 4 columnas
        matrizIrregular[2] = new int[1]; // Fila 2 tiene 1 columna

        System.out.println("--- RECORRIDO DINÁMICO DE MATRIZ IRREGULAR ---");
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print("[" + matrizIrregular[i][j] + "] ");
            }
            System.out.println();
        }
    }
}