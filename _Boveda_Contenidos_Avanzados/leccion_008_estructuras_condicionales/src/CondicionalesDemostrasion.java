package UT01_Introduccion_Programacion.leccion_008_estructuras_condicionales.src;

/**
 * 008. Estructuras de Control Condicionales
 * Objetivo: Demostrar la bifurcación lógica mediante if-else y la selección múltiple con switch.
 */
public class CondicionalesDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * EVALUACIÓN DE FLUJOS CONDICIONALES
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE CONDICIONALES EN JAVA");
        System.out.println("==================================================");

        try {
            int calificacion = 85;

            // 1. Cadena Condicional if-else
            if (calificacion >= 90) {
                System.out.println("-> Calificación: Sobresaliente (A)");
            } else if (calificacion >= 70) {
                System.out.println("-> Calificación: Notable / Aprobado (B)");
            } else {
                System.out.println("-> Calificación: Suspenso (Requiere refuerzo)");
            }

            // 2. Selección Múltiple con switch moderno (Flechas)
            int codigoDia = 3;
            String nombreDia = switch (codigoDia) {
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                default -> "Día no válido";
            };

            System.out.println("-> Día de la semana seleccionado: " + nombreDia);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar las estructuras condicionales: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Olvidar incluir la instrucción 'break' en el modelo 
        // clásico de un bloque 'switch' provocará el fenómeno de 'fall-through', 
        // ejecutando por error todos los casos subsiguientes en cadena.
    }
}
