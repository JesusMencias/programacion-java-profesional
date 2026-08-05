package UT01_Introduccion_Programacion.leccion_017_clases_abstractas.src;

/**
 * 017. Clase Principal de Ejecución
 * Objetivo: Demostrar la prohibición de instanciar clases abstractas y el uso de subclases concretas.
 */
public class MainAbstractas {

    public static void main(String[] args) {
        /*
         * ==========================================
         * VALIDACIÓN DE ABSTRACCIÓN Y POLIMORFISMO
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE CLASES ABSTRACTAS");
        System.out.println("==================================================");

        try {
            // Uso polimórfico a través de la clase abstracta
            Figura miCirculo = new Circulo("Rojo", 5.0);
            miCirculo.mostrarColor();
            System.out.println("-> Área calculada: " + miCirculo.calcularArea());

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la ejecución abstracta: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Intentar instanciar directamente una clase abstracta 
        // escribiendo 'Figura f = new Figura("Azul");' provocará un error crítico de compilación, 
        // ya que Java prohíbe reservar memoria para entidades incompletas sin implementar.
    }
}
