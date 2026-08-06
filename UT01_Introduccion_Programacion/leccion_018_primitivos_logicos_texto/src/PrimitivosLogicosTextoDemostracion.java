package UT01_Introduccion_Programacion.leccion_018_primitivos_logicos_texto.src;

/**
 * 018. Primitivos lógicos y texto: char (Unicode), boolean
 * Objetivo: Demostrar el uso de valores booleanos de verdad y caracteres Unicode 
 *           delimitados por comillas simples en Java.
 */
public class PrimitivosLogicosTextoDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: PRIMITIVOS BOOLEAN Y CHAR (UNICODE)");
        System.out.println("==================================================");

        try {
            // 1. Primitivo Lógico (Boolean)
            boolean sistemaOperativoActivo = true;
            boolean errorCriticoDetectado = false;

            // 2. Primitivo de Texto (Char - Unicode y comillas simples)
            char letraInicial = 'J';
            char simboloArroba = '\u0040'; // Representación Unicode directa de '@'
            char valorNumericoChar = 75;     // Corresponde al carácter 'K' en la tabla Unicode

            System.out.println("-> Estado del Sistema: " + sistemaOperativoActivo);
            System.out.println("-> ¿Hay Error?:        " + errorCriticoDetectado);
            System.out.println("-> Carácter Inicial:   " + letraInicial);
            System.out.println("-> Símbolo Unicode:    " + simboloArroba);
            System.out.println("-> Char desde Entero:  " + valorNumericoChar);

            System.out.println("\n[VALIDACIÓN]: Los tipos boolean y char operan de forma");
            System.out.println("estricta en la Pila (Stack) con asignaciones directas.");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar primitivos lógicos y de texto: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
