package UT01_Introduccion_Programacion.leccion_016_polimorfismo.src;

/**
 * 016. Clase Principal de Ejecución
 * Objetivo: Demostrar el polimorfismo y la ligadura dinámica en tiempo de ejecución.
 */
public class MainPolimorfismo {

    public static void main(String[] args) {
        /*
         * ==========================================
         * EJECUCIÓN POLIMÓRFICA
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE POLIMORFISMO Y @OVERRIDE");
        System.out.println("==================================================");

        try {
            // Referencia de la superclase apuntando a objetos de distintas subclases
            Animal miPerro = new Perro();
            Animal miGato = new Gato();

            // Llamada polimórfica al mismo método con comportamientos distintos
            miPerro.hacerSonido();
            miGato.hacerSonido();

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la ejecución polimórfica: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Si intentas invocar un método exclusivo de la subclase 
        // (como un método propio de Perro) utilizando una referencia de tipo Animal, 
        // el compilador denegará la acción a menos que realces un cast explícito de tipos.
    }
}
