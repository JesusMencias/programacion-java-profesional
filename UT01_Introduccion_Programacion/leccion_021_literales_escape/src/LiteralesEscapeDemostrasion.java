package UT01_Introduccion_Programacion.leccion_021_literales_escape.src;

/**
 * 021. Literales, Secuencias de Escape e Inferencia de Tipos (var)
 * Objetivo: Demostrar el uso de valores literales fijos, caracteres de escape y var en Java.
 */
public class LiteralesEscapeDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * MANIPULACIÓN DE LITERALES Y FORMATO
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE LITERALES Y SECUENCIAS DE ESCAPE");
        System.out.println("==================================================");

        try {
            // 1. Uso de Secuencias de Escape (\n para salto, \t para tabulación, \" para comillas)
            String mensajeFormateado = "Curso:\tJava 21\nAutor:\t\"Código Autodidacta\"\nRuta:\tC:\\Proyectos\\Java";
            System.out.println(mensajeFormateado);

            System.out.println("--------------------------------------------------");

            // 2. Inferencia de Tipos con var (Java 10+)
            var curso = "Programación DAM"; // Inferido como String
            var leccion = 21;               // Inferido como int
            var versionJava = 21.0;         // Inferido como double

            System.out.println("-> [VAR] Curso infirido: " + curso);
            System.out.println("-> [VAR] Lección inferida: " + leccion);
            System.out.println("-> [VAR] Versión inferida: " + versionJava);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la ejecución de literales: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: La palabra reservada 'var' no es un tipo dinámico como en JavaScript; 
        // el tipo se fija de manera definitiva en el momento de compilar y no puede cambiar 
        // a otro tipo de dato posteriormente en el código.
    }
}
