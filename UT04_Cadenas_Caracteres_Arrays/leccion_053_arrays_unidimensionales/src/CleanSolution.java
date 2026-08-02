package UT04_Cadenas_Caracteres_Arrays.leccion_053_arrays_unidimensionales.src;

import java.util.Arrays;

/**
 * Recorrido dinámico acotado y clonación profunda mediante java.util.Arrays.
 */
public class CleanSolution {

    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        // Clonación limpia en nuevo bloque independiente en Heap
        int[] copiaIndependiente = Arrays.copyOf(original, original.length);

        copiaIndependiente[0] = 999;

        System.out.println("Original preservado  : " + Arrays.toString(original));
        System.out.println("Copia independiente  : " + Arrays.toString(copiaIndependiente));

        // Recorrido dinámico exclusivo (< length)
        System.out.print("Recorrido acotado    : ");
        for (int i = 0; i < original.length; i++) {
            System.out.print("[" + original[i] + "] ");
        }
        System.out.println();
    }
}