package UT01_Introduccion_Programacion.leccion_018_interfaces.src;

/**
 * 018. Clase Principal de Ejecución
 * Objetivo: Demostrar la implementación múltiple de contratos mediante interfaces.
 */
public class MainInterfaces {

    public static void main(String[] args) {
        /*
         * ==========================================
         * VALIDACIÓN DE CONTRATOS MÚLTIPLES
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE INTERFACES Y CONTRATOS MÚLTIPLES");
        System.out.println("==================================================");

        try {
            // Instanciación del objeto que cumple múltiples contratos
            Atleta atleta = new Atleta("Jesús");

            atleta.beber();
            atleta.comer();

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la ejecución de interfaces: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Todos los métodos declarados dentro de una interfaz tradicional 
        // son implícitamente públicos y abstractos; intentar asignarles un modificador privado 
        // o protegido en la clase que los implementa romperá el contrato y generará un error de compilación.
    }
}
