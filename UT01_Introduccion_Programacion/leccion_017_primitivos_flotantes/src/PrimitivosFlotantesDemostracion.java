package UT01_Introduccion_Programacion.leccion_017_primitivos_flotantes.src;

/**
 * 017. Primitivos flotantes: float vs. double, sufijo F, precisión IEEE 754
 * Objetivo: Demostrar la declaración de tipos flotantes, la obligatoriedad del sufijo F 
 *           y evidenciar el comportamiento de imprecisión decimal del estándar IEEE 754.
 */
public class PrimitivosFlotantesDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: FLOTANTES, SUFIJO F E IEEE 754");
        System.out.println("==================================================");

        try {
            // 1. Declaración con sufijo F obligatoria para float (32 bits)
            float temperaturaActual = 23.5F;
            
            // 2. Declaración predeterminada double (64 bits)
            double saldoBancario = 12540.75;

            System.out.println("-> Tipo float (32 bits):  " + temperaturaActual + " °C");
            System.out.println("-> Tipo double (64 bits): " + saldoBancario + " EUR");

            // 3. DEMOSTRACIÓN DE IMPRECISIÓN IEEE 754
            System.out.println("\n[ANÁLISIS DE PRECISIÓN IEEE 754]:");
            double resultadoImpreciso = 0.1 + 0.2;
            System.out.println("   Suma de 0.1 + 0.2 = " + resultadoImpreciso); 
            // El resultado mostrará 0.30000000000000004 debido a la conversión binaria finita.

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar tipos flotantes: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
