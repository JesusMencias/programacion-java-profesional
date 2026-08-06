package UT01_Introduccion_Programacion.leccion_015_herencia.src;

/**
 * 015. Clase Principal de Ejecución
 * Objetivo: Validar la herencia de métodos y atributos entre la superclase y la subclase.
 */
public class MainHerencia {

    public static void main(String[] args) {
        /*
         * ==========================================
         * INSTANCIACIÓN JERÁRQUICA
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE HERENCIA EN JAVA");
        System.out.println("==================================================");

        try {
            // Instanciación de la subclase
            CocheDeportivo deportivo = new CocheDeportivo("Ferrari", 280, false);

            // Método heredado de la superclase Vehiculo
            deportivo.mostrarInfo();

            // Método propio de la subclase CocheDeportivo
            deportivo.activarTurbo();

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al ejecutar la jerarquía de herencia: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Java no permite herencia múltiple de clases (una subclase 
        // no puede extender de dos padres a la vez utilizando extends) para evitar ambigüedades 
        // lógicas y arquitectónicas en el árbol de ejecución.
    }
}
