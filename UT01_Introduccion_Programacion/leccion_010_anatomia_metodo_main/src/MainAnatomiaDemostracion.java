package UT01_Introduccion_Programacion.leccion_010_anatomia_metodo_main.src;

/**
 * 010. Anatomía de public static void main(String[] args) línea a línea
 * Objetivo: Demostrar la recepción de parámetros por consola a través del array args[] 
 *           y la naturaleza estática del punto de entrada.
 */
public class MainAnatomiaDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: ANATOMÍA DEL MÉTODO MAIN");
        System.out.println("==================================================");

        // Análisis del contrato de argumentos de consola (String[] args)
        if (args != null && args.length > 0) {
            System.out.println("-> [Argumentos recibidos por consola]: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("   Arg[" + i + "] = " + args[i]);
            }
        } else {
            System.out.println("-> [Aviso]: No se pasaron argumentos adicionales en args[].");
        }

        System.out.println("\n[ANATOMÍA CONTRACTUAL]:");
        System.out.println(" - public: Visible globalmente para la JVM.");
        System.out.println(" - static: Ejecutable sin instanciar objetos previos.");
        System.out.println(" - void:   Sin valor de retorno al finalizar.");
        System.out.println(" - main:   Identificador obligatorio para el arranque.");
        
        System.out.println("==================================================");
    }
}
