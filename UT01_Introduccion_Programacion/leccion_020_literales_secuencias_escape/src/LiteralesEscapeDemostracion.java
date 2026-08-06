package UT01_Introduccion_Programacion.leccion_020_literales_secuencias_escape.src;

/**
 * 020. Literales y secuencias de escape
 * Objetivo: Demostrar el uso avanzado de literales y el control de formato 
 *           mediante secuencias de escape (newline, tab, quotes, backslash).
 */
public class LiteralesEscapeDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: LITERALES Y SECUENCIAS DE ESCAPE");
        System.out.println("==================================================");

        try {
            // 1. Uso de Literales (valores fijos)
            int codigoError = 404;
            String mensaje = "Archivo no encontrado";

            // 2. Uso de Secuencias de Escape para formateo profesional
            // \n : Salto de línea
            // \t : Tabulación horizontal
            // \" : Comilla doble escapada
            // \\ : Barra invertida escapada
            
            String salidaFormateada = "REPORTE DE SISTEMA:\n" +
                                      "\tEstado:\t\tERROR\n" +
                                      "\tCódigo:\t\t" + codigoError + "\n" +
                                      "\tMensaje:\t\"" + mensaje + "\"\n" +
                                      "\tRuta:\t\tC:\\\\Logs\\\\System.log";

            System.out.println(salidaFormateada);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar literales y secuencias de escape: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
