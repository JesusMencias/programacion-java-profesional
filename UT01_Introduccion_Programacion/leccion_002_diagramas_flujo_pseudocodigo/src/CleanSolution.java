package UT01_Introduccion_Programacion.leccion_002_diagramas_flujo_pseudocodigo.src;

/**
 * Tradución directa de Pseudocódigo / Diagrama de Flujo a Código Fuente Java.
 */
public class CleanSolution {
    public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiro = 250.0;

        if (validaRetiro(saldoInicial, retiro)) {
            saldoInicial -= retiro;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldoInicial);
        } else {
            System.err.println("Error: Fondos insuficientes para el retiro.");
        }
    }

    private static boolean validaRetiro(double saldo, double monto) {
        return monto > 0 && saldo >= monto;
    }
}