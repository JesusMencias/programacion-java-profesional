package UT01_Introduccion_Programacion.leccion_002_diagramas_flujo_pseudocodigo.src;

/**
 * 002. Representación de Algoritmos (De Pseudocódigo a Java)
 * Objetivo: Demostrar cómo un diseño agnóstico en Pseudocódigo se traduce a sintaxis física.
 */
public class TraduccionAlgoritmo {
    
    public static void main(String[] args) {
        /*
         * ==========================================
         * DISEÑO LÓGICO: PSEUDOCÓDIGO PURO (Mental)
         * ==========================================
         * INICIO
         *    NUMERO edad_usuario <- 20
         *    SI edad_usuario >= 18 ENTONCES
         *       IMPRIMIR "Acceso concedido. Es mayor de edad."
         *    SINO
         *       IMPRIMIR "Acceso denegado."
         *    FIN SI
         * FIN
         * ==========================================
         */
        
        System.out.println("=== EJECUCIÓN FÍSICA EN JAVA ===");
        
        int edadUsuario = 20;
        
        // El Rombo de decisión del diagrama de flujo se convierte en un 'if'
        if (edadUsuario >= 18) {
            // Output: "Acceso concedido. Es mayor de edad."
            System.out.println("Acceso concedido. Es mayor de edad.");
        } else {
            System.out.println("Acceso denegado.");
        }
        
        // ⚠️ TRAMPA FRECUENTE: Intentar escribir el bloque 'if-else' en Java sin 
        // tener claro en papel o pseudocódigo cuál es la condición lógica a evaluar.
        // Siempre dibuja tu diagrama mental primero.
    }
}