package UT01_Introduccion_Programacion.leccion_006_tipos_datos_primitivos.src;

/**
 * 006. Tipos de Datos Primitivos en Java
 * Objetivo: Demostrar la declaración y límites de almacenamiento de los 8 tipos primitivos.
 */
public class PrimitivosDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * DECLARACIÓN Y ASIGNACIÓN DE TIPOS PRIMITIVOS
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE TIPOS DE DATOS PRIMITIVOS");
        System.out.println("==================================================");

        try {
            // 1. Enteros
            byte edadByte = 25;
            short codigoPostal = 11408;
            int poblacionLocal = 215000;
            long distanciaAstronomica = 9460730472580800L;

            // 2. Decimales
            float temperaturaActual = 36.6f;
            double saldoBancario = 12450.75;

            // 3. Caracter y Lógico
            char calificacionLetra = 'A';
            boolean sistemaActivo = true;

            // Salida de consola estructurada
            System.out.println("-> Entero byte:         " + edadByte);
            System.out.println("-> Entero short:        " + codigoPostal);
            System.out.println("-> Entero int:          " + poblacionLocal);
            System.out.println("-> Entero long:         " + distanciaAstronomica);
            System.out.println("-> Decimal float:       " + temperaturaActual);
            System.out.println("-> Decimal double:      " + saldoBancario);
            System.out.println("-> Carácter char:       " + calificacionLetra);
            System.out.println("-> Booleano boolean:    " + sistemaActivo);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar los tipos primitivos: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Asignar un valor decimal con punto flotante directamente 
        // a un float sin añadir la letra 'f' al final provocará un error de compilación 
        // por pérdida de precisión, ya que Java asume que todos los decimales son double por defecto.
    }
}
