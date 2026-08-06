package UT01_Introduccion_Programacion.leccion_001_concepto_algoritmo_programa.src;

/**
 * CLEAN CODE: Algoritmo Finito, Preciso y Definido.
 * Implementación determinista de cálculo algorítmico acotado.
 */
public class CleanSolution {
    public static void main(String[] args) {
        int limite = 5;
        System.out.println("=== INICIO DE ALGORITMO DETERMINISTA ===");
        
        for (int i = 1; i <= limite; i++) {
            int resultado = i * 2;
            System.out.println("Paso " + i + ": Resultado evaluado = " + resultado);
        }
        
        System.out.println("=== FIN DE EJECUCIÓN: ESTADO DETERMINADO ===");
    }
}