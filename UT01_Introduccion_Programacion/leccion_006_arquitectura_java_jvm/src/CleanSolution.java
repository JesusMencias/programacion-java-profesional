package UT01_Introduccion_Programacion.leccion_006_arquitectura_java_jvm.src;

/**
 * Verificación de la Arquitectura de Compilación y Runtime de la JVM.
 */
public class CleanSolution {
    public static void main(String[] args) {
        System.out.println("Flujo de compilación: Código Fuente (.java) -> javac -> Bytecode (.class)");
        System.out.println("Ejecutando sobre la JVM Versión: " + System.getProperty("java.vm.name"));
    }
}