package UT01_Introduccion_Programacion.leccion_004_clasificacion_lenguajes.src;

/**
 * Demostración de Abstracción de Alto Nivel en Java.
 */
public class CleanSolution {
    public static void main(String[] args) {
        // Alto Nivel: Gestión automática de memoria y abstracción del hardware
        String[] tecnologias = {"Compilado", "Bytecode", "Interprete JIT"};
        for (String tec : tecnologias) {
            System.out.println("Capa de abstracción Java: " + tec);
        }
    }
}