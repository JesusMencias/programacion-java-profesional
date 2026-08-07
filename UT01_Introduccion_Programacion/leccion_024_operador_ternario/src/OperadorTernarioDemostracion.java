package UT01_Introduccion_Programacion.leccion_024_operador_ternario.src;

/**
 * 024. Operador ternario
 * Objetivo: Demostrar la síntesis lógica mediante el operador ternario 
 *           y resaltar su uso correcto en asignaciones.
 */
public class OperadorTernarioDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: OPERADOR TERNARIO (?:)");
        System.out.println("==================================================");

        try {
            int edad = 20;
            
            // Operador ternario: Compactación de if-else
            String estado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
            
            System.out.println("-> Edad: " + edad + " | Estado: " + estado);

            // Comparación de compatibilidad de tipos
            int puntos = 85;
            String calificacion = (puntos >= 90) ? "Excelente" : "Aprobado";
            
            System.out.println("-> Puntos: " + puntos + " | Calificación: " + calificacion);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operador ternario: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
