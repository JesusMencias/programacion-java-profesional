package UT01_Introduccion_Programacion.leccion_011_variables_memoria_ram.src;

/**
 * 011. Variables y memoria RAM: declaración, inicialización y asignación
 * Objetivo: Demostrar empíricamente las fases del ciclo de vida de una variable 
 *           en la memoria RAM y su mutación en tiempo de ejecución.
 */
public class VariablesDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: CICLO DE VIDA DE VARIABLES EN RAM");
        System.out.println("==================================================");

        try {
            // 1. Declaración e Inicialización simultánea (Reserva de espacio + valor inicial seguro)
            int stockProductos = 150;
            double precioUnitario = 49.99;

            System.out.println("-> [Estado Inicial]: Stock = " + stockProductos + " | Precio = " + precioUnitario);

            // 2. Asignación posterior (Mutación del estado en RAM)
            stockProductos = 120; // Venta de 30 unidades
            double valorInventarioTotal = stockProductos * precioUnitario;

            System.out.println("-> [Tras Mutación]:  Stock actualizado = " + stockProductos);
            System.out.println("-> [Cálculo Derivado]: Valor total inventario = " + valorInventarioTotal + " EUR");

            System.out.println("\n[ARQUITECTURA RAM]: Las variables locales fueron asignadas");
            System.out.println("en la Pila (Stack) vinculadas estrictamente a su tipo estático.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar variables en memoria: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
