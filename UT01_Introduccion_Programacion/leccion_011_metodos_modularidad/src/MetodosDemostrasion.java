package UT01_Introduccion_Programacion.leccion_011_metodos_modularidad.src;

/**
 * 011. Métodos y Modularidad en Java
 * Objetivo: Demostrar la declaración de métodos estáticos, paso de parámetros y retorno de valores.
 */
public class MetodosDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * INVOCACIÓN Y PRUEBA DE MÓDULOS
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE MÉTODOS Y MODULARIDAD");
        System.out.println("==================================================");

        try {
            // 1. Invocación de método sin retorno (void)
            saludarUsuario("Autodidacta");

            // 2. Invocación de método con retorno de valor
            int resultadoSuma = sumar(15, 25);
            System.out.println("-> Resultado de la suma modular: " + resultadoSuma);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la ejecución del método: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Escribir instrucciones de código justo después de una 
        // sentencia 'return' dentro de un método provocará un error de compilación 
        // indicando que el código es inalcanzable (unreachable statement).
    }

    /**
     * Método auxiliar sin valor de retorno (void).
     * @param nombre Cadena de texto con el nombre del usuario.
     */
    public static void saludarUsuario(String nombre) {
        System.out.println("-> [SALUDO] ¡Hola, " + nombre + "! Bienvenido al bloque modular.");
    }

    /**
     * Método auxiliar con retorno de tipo entero.
     * @param a Primer sumando.
     * @param b Segundo sumando.
     * @return Sumando A y B para calcular el total.
     */
    public static int sumar(int a, int b) {
        return a + b;
    }
}
