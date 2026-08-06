package UT01_Introduccion_Programacion.leccion_000_curso_introduccion.src;

/**
 * 000. Presentación Oficial del Curso
 * Objetivo: Confirmar la operatividad de Java 21 LTS en el entorno de desarrollo.
 */
public class PresentacionCurso {
    
    public static void main(String[] args) {
        // Output: "=== BIENVENIDO A CÓDIGO AUTODIDACTA ==="
        System.out.println("=== BIENVENIDO A CÓDIGO AUTODIDACTA ===");
        
        // Output: "Motor de ejecución: Java 21 LTS"
        System.out.println("Motor de ejecución: Java " + System.getProperty("java.version") + " LTS");
        
        // Output: "Entorno de desarrollo configurado correctamente."
        System.out.println("Entorno de desarrollo configurado correctamente.");
        
        // ⚠️ TRAMPA FRECUENTE: Intentar avanzar a la Lección 1 sin haber comprendido 
        // la filosofía atómica (1 concepto = 1 archivo). No adelantes materia.
        System.out.println("[INFO] Inicialización de hoja de ruta completada. Listo para Lección 001.");
    }
}