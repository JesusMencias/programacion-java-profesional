package UT01_Introduccion_Programacion.leccion_009_instalacion_entorno_ide.src;

/**
 * DEMOSTRACIÓN DE BAD PATH: Error de Discrepancia de Versión y Entorno (Version Mismatch).
 * Muestra el impacto de no configurar JAVA_HOME ni PATH correctamente para JDK 21 LTS.
 */
public class BadPath {

    public static void main(String[] args) {
        System.out.println("--- BAD PATH: ENTORNO NO CONFIGURADO / JRE OBSOLETO ---");
        System.out.println("SÍNTOMA 1: 'javac' no se reconoce como un comando interno o externo.");
        System.out.println("SÍNTOMA 2: java.lang.UnsupportedClassVersionError (Class file version 65.0 vs JRE antiguo).");
        System.out.println("CAUSA: Discrepancia entre la versión del compilador (JDK 21) y la máquina virtual activa en el PATH.");
    }
}