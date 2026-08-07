package UT01_Introduccion_Programacion.leccion_029_conversiones_casting.src;

/**
 * 029. Conversiones: casting implícito/explícito, parseo y String.valueOf()
 * Objetivo: Demostrar las conversiones automáticas y manuales entre primitivos,
 *           el parseo desde cadenas y la serialización a texto mediante String.valueOf().
 */
public class ConversionesDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: CONVERSIONES, CASTING Y PARSEO");
        System.out.println("==================================================");

        try {
            // 1. Casting Implícito (Widening: int a double)
            int enteroBase = 100;
            double decimalAmpliado = enteroBase; // Automático y seguro
            System.out.println("-> Casting Implícito (int a double): " + decimalAmpliado);

            // 2. Casting Explícito (Narrowing: double a int con truncamiento)
            double piOriginal = 3.14159;
            int piTruncado = (int) piOriginal; // Forzado manual (se pierde la parte decimal)
            System.out.println("-> Casting Explícito (double a int): " + piTruncado);

            // 3. Parseo (String a Primitivo)
            String inputUsuario = "450";
            int edadParseada = Integer.parseInt(inputUsuario);
            System.out.println("-> Parseo de String a int:          " + (edadParseada + 50));

            // 4. Conversión a Texto (String.valueOf)
            double saldoActual = 1500.50;
            String textoSaldo = String.valueOf(saldoActual);
            System.out.println("-> Conversión a String:             " + textoSaldo);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar conversiones: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
