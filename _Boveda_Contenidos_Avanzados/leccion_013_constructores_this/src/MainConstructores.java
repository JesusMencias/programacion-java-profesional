package UT01_Introduccion_Programacion.leccion_013_constructores_this.src;

/**
 * 013. Clase Principal de Ejecución
 * Objetivo: Instanciar objetos empleando los constructores sobrecargados.
 */
public class MainConstructores {

    public static void main(String[] args) {
        /*
         * ==========================================
         * INSTANCIACIÓN CONSTRUCTIVA Y VALIDACIÓN
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE CONSTRUCTORES Y OPERADOR THIS");
        System.out.println("==================================================");

        try {
            // 1. Instanciación usando el constructor completo
            Libro libro1 = new Libro("Clean Code", "Robert C. Martin", 464);
            libro1.mostrarDetalles();

            // 2. Instanciación usando el constructor sobrecargado
            Libro libro2 = new Libro("Java Básico", "Autodidacta");
            libro2.mostrarDetalles();

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al instanciar mediante constructores: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Si defines explícitamente un constructor con parámetros 
        // y luego intentas invocar el constructor por defecto sin argumentos (new Libro()) 
        // sin haberlo declarado también en la clase, el compilador generará un error inmediato.
    }
}
