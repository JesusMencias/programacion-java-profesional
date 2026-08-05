package UT01_Introduccion_Programacion.leccion_014_encapsulamiento.src;

/**
 * 014. Clase Principal de Ejecución
 * Objetivo: Validar la interacción controlada con objetos encapsulados.
 */
public class MainEncapsulamiento {

    public static void main(String[] args) {
        /*
         * ==========================================
         * VALIDACIÓN DE ACCESO CONTROLADO
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE ENCAPSULAMIENTO Y GETTERS/SETTERS");
        System.out.println("==================================================");

        try {
            // Instanciación del objeto con estado protegido
            CuentaBancaria cuenta = new CuentaBancaria("Jesús Mencias", 1500.50);

            // Consulta controlada mediante getter
            System.out.println("-> Titular de la cuenta: " + cuenta.getTitular());
            System.out.println("-> Saldo inicial actual: " + cuenta.getSaldo() + " €");

            // Intento de alteración inválida a través del setter blindado
            cuenta.setSaldo(-500.00);
            System.out.println("-> Saldo tras intento de fraude/error: " + cuenta.getSaldo() + " €");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la gestión del encapsulamiento: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Declarar un atributo como 'public' para ahorrar tiempo 
        // destruye el principio de encapsulamiento, permitiendo que cualquier bloque externo 
        // corrompa el estado del objeto asignando valores fuera de toda lógica de negocio.
    }
}
