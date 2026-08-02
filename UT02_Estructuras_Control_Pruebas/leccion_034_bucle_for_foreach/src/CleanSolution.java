package UT02_Estructuras_Control_Pruebas.leccion_034_bucle_for_foreach.src;

public class CleanSolution {
    public static void main(String[] args) {
        String[] transacciones = {"TX_101", "TX_102", "TX_103"};

        for (int i = 0; i < transacciones.length; i++) {
            System.out.println("Índice acotado [" + i + "]: " + transacciones[i]);
        }

        for (String tx : transacciones) {
            System.out.println("Transacción procesada: " + tx);
        }
    }
}