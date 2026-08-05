package leccion_020_matrices_multidimensionales.src;

/**
 * 020. Arrays Multidimensionales y Matrices Irregulares (Jagged)
 * Objetivo: Demostrar la declaración, inicialización y recorrido seguro de matrices regulares e irregulares en Java.
 */
public class MatricesDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * PROCESAMIENTO DE ESTRUCTURAS TABULARES
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE MATRICES Y ARRAYS DE ARRAYS");
        System.out.println("==================================================");

        try {
            // 1. Declaración e inicialización de una Matriz Regular (3 filas x 3 columnas)
            int[][] matrizRegular = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
            };

            System.out.println("-> Recorrido de Matriz Regular (3x3):");
            for (int i = 0; i < matrizRegular.length; i++) {
                for (int j = 0; j < matrizRegular[i].length; j++) {
                    System.out.print(matrizRegular[i][j] + "\t");
                }
                System.out.println(); // Salto de línea por cada fila
            }

            // 2. Declaración de una Matriz Irregular (Jagged Array) con filas de tamaño variable
            int[][] matrizIrregular = new int[3][];
            matrizIrregular[0] = new int[]{1, 2};       // Fila 0 con 2 columnas
            matrizIrregular[1] = new int[]{3, 4, 5};    // Fila 1 con 3 columnas
            matrizIrregular[2] = new int[]{6};          // Fila 2 con 1 columna

            System.out.println("\n-> Recorrido de Matriz Irregular (Jagged):");
            for (int i = 0; i < matrizIrregular.length; i++) {
                for (int j = 0; j < matrizIrregular[i].length; j++) {
                    System.out.print(matrizIrregular[i][j] + "\t");
                }
                System.out.println();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("[ERROR DE LÍMITES] Desbordamiento en los índices de la matriz: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar la estructura matricial: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Confundir las dimensiones al declarar una matriz irregular 
        // escribiendo 'new int[3][3]' de forma estricta impedirá asignar luego tamaños 
        // personalizados independientes a cada fila individualmente.
    }
}
