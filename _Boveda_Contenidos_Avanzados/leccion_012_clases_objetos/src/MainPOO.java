package UT01_Introduccion_Programacion.leccion_012_clases_objetos.src;

/**
 * 012. Introducción a la POO (Clase Principal de Ejecución)
 * Objetivo: Demostrar la instanciación de objetos a partir de una clase molde.
 */
public class MainPOO {

    public static void main(String[] args) {
        /*
         * ==========================================
         * INSTANCIACIÓN Y USO DE OBJETOS
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE CLASES Y OBJETOS (POO)");
        System.out.println("==================================================");

        try {
            // Instanciación del Objeto 1
            Coche miCoche = new Coche();
            miCoche.marca = "Toyota";
            miCoche.modelo = "Corolla";
            miCoche.velocidadActual = 0;

            // Invocación de métodos de instancia
            miCoche.acelerar(40);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al instanciar u operar con el objeto: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Intentar invocar un método o acceder a un atributo de un objeto 
        // cuya referencia sea 'null' (sin haber utilizado el operador 'new') provocará 
        // una excepción crítica de tipo NullPointerException en tiempo de ejecución.
    }
}
