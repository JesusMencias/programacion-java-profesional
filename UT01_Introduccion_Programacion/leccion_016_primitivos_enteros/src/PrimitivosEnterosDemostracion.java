package UT01_Introduccion_Programacion.leccion_016_primitivos_enteros.src;

/**
 * 016. Primitivos enteros: byte, short, int, long, rangos y desbordamiento
 * Objetivo: Demostrar los límites de almacenamiento de los tipos enteros primitivos 
 *           y evidenciar el fenómeno crítico del desbordamiento (overflow).
 */
public class PrimitivosEnterosDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: ENTEROS PRIMITIVOS Y DESBORDAMIENTO");
        System.out.println("==================================================");

        try {
            // 1. Declaración de tipos enteros y sus límites en la clase Wrapper
            byte minByte = Byte.MIN_VALUE;
            byte maxByte = Byte.MAX_VALUE;
            int maxInt = Integer.MAX_VALUE;
            long poblacionMundial = 8000000000L; // Uso obligatorio del sufijo L

            System.out.println("-> Rango Byte:   Min = " + minByte + " | Max = " + maxByte);
            System.out.println("-> Máximo Int:   " + maxInt);
            System.out.println("-> Literal Long: " + poblacionMundial);

            // 2. DEMOSTRACIÓN DE DESBORDAMIENTO (Overflow)
            System.out.println("\n[SIMULACIÓN DE OVERFLOW]:");
            
            byte numeroBorde = 127; // Límite máximo de byte
            System.out.println("   Valor inicial de byte: " + numeroBorde);

            // Al sumar 1 al máximo, ocurre el desbordamiento por exceso
            numeroBorde++; 
            System.out.println("   Tras sumar 1 (Overflow): " + numeroBorde); // Salta al mínimo (-128)

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar enteros primitivos: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
