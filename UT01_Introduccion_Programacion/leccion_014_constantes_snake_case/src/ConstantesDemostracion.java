package UT01_Introduccion_Programacion.leccion_014_constantes_snake_case.src;

/**
 * 014. Constantes: final, static final y convención SNAKE_CASE
 * Objetivo: Demostrar la declaración de valores inmutables aplicando 
 *           los modificadores final y static final junto con el formato SNAKE_CASE.
 */
public class ConstantesDemostracion {

    // DECLARACIÓN DE CONSTANTES GLOBALES DE CLASE (SNAKE_CASE)
    public static final double TASA_INTERES_ANUAL = 3.5;
    public static final int MAXIMO_INTENTOS_LOGIN = 3;
    public static final String VERSION_SISTEMA = "v1.0.0-RELEASE";

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: CONSTANTES Y CONVENCIÓN SNAKE_CASE");
        System.out.println("==================================================");

        try {
            // Uso de constantes globales en operaciones lógicas
            double capitalInicial = 1000.0;
            double beneficioEstimado = capitalInicial * (TASA_INTERES_ANUAL / 100);

            System.out.println("-> Versión del Software:  " + VERSION_SISTEMA);
            System.out.println("-> Intentos Permitidos:   " + MAXIMO_INTENTOS_LOGIN);
            System.out.println("-> Tasa de Interés Fija:  " + TASA_INTERES_ANUAL + "%");
            System.out.println("-> Beneficio Calculado:   " + beneficioEstimado + " EUR");

            // INTENTO INVÁLIDO DE REASIGNACIÓN (Prohibido por final):
            // TASA_INTERES_ANUAL = 4.0; -> Error de compilación instantáneo

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar constantes inmutables: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
