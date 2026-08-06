package UT01_Introduccion_Programacion.leccion_019_stack_vs_heap.src;

/**
 * 019. Stack vs. Heap: primitivos vs. tipos de referencia
 * Objetivo: Demostrar empíricamente la diferencia de almacenamiento entre variables 
 *           primitivas (valor directo en Stack) y tipos de referencia (puntero en Stack y objeto en Heap).
 */
public class StackVsHeapDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: STACK VS. HEAP (PRIMITIVOS Y REFERENCIAS)");
        System.out.println("==================================================");

        try {
            // 1. TIPO PRIMITIVO: Su valor reside directamente en el Stack
            int numeroPrimitivo = 100;

            // 2. TIPO DE REFERENCIA: La referencia (puntero) vive en el Stack, 
            //    pero el objeto real (la instancia de CuentaBancaria) se ubica en el Heap.
            CuentaBancaria cuentaRef = new CuentaBancaria(5000.0);

            System.out.println("-> [Stack] Valor primitivo directo: " + numeroPrimitivo);
            System.out.println("-> [Heap] Objeto referenciado (Saldo): " + cuentaRef.getSaldo() + " EUR");

            // Demostración de copia por referencia
            CuentaBancaria otraCuentaRef = cuentaRef; // Ambas apuntan al MISMO objeto en el Heap
            otraCuentaRef.depositar(500.0);

            System.out.println("-> [Heap Verificación] Saldo tras modificar mediante otra referencia: " + cuentaRef.getSaldo() + " EUR");

            System.out.println("\n[ARQUITECTURA MEMORIA]: Los primitivos operan directamente en Stack;");
            System.out.println("los objetos instanciados mediante 'new' residen en el Heap dinámico.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la demostración de Stack vs Heap: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}

/**
 * Clase auxiliar para ilustrar objetos alojados en el Heap
 */
class CuentaBancaria {
    private double saldo; // Atributo almacenado en el Heap dentro del objeto

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
