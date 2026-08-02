package UT01_Introduccion_Programacion.leccion_010_anatomia_main.src;

/**
 * DEMOSTRACIÓN DE BAD PATH: Fragilidad en CLI Args.
 * Intentar acceder a args[0] sin validar la longitud del array provoca ArrayIndexOutOfBoundsException.
 */
public class BadPath {

    // Si alteras esta firma (ej. removiendo static o haciendo private), la JVM lanza NoSuchMethodError
    public static void main(String[] args) {
        System.out.println("--- BAD PATH: ACCESO CIEGO A PARÁMETROS CLI ---");
        
        // Anti-patrón: Asumir que el usuario siempre pasa argumentos por consola
        String parametroConfig = args[0]; // Provoca fallo en runtime si args.length == 0
        System.out.println("Configuración cargada: " + parametroConfig);
    }
}