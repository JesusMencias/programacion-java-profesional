package UT01_Introduccion_Programacion.leccion_026_evaluacion_cortocircuito.src;

/**
 * 026. Evaluación en cortocircuito: prevención de NullPointerException y ArithmeticException
 * Objetivo: Demostrar empíricamente cómo el cortocircuito lógico (&&, ||) previene 
 *           excepciones críticas al evaluar expresiones de izquierda a derecha.
 */
public class CortocircuitoDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: EVALUACIÓN EN CORTOCIRCUITO");
        System.out.println("==================================================");

        try {
            // 1. Prevención de NullPointerException
            String texto = null;

            // Gracias al cortocircuito en '&&', como texto != null es falso,
            // la JVM omite 'texto.length() > 0', evitando un NullPointerException fatal.
            boolean esValidoSeguro = (texto != null) && (texto.length() > 0);
            System.out.println("-> Validación segura de objeto nulo: " + esValidoSeguro);

            // 2. Prevención de ArithmeticException (División por cero)
            int divisor = 0;
            int total = 100;

            // Si el divisor es cero, la primera condición 'divisor != 0' es falsa,
            // cortocircuitando la operación y evitando una ArithmeticException.
            boolean divisionSegura = (divisor != 0) && ((total / divisor) > 5);
            System.out.println("-> Validación segura de división por cero: " + divisionSegura);

            System.out.println("\n[ESTADO]: Ejecución completada sin excepciones gracias al cortocircuito.");

        } catch (Exception e) {
            System.err.println("[ERROR] Excepción no controlada: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
