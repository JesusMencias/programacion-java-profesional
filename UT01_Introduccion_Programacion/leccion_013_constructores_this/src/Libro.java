package UT01_Introduccion_Programacion.leccion_013_constructores_this.src;

/**
 * 013. Clase Modelo: Libro
 * Objetivo: Demostrar la aplicación de constructores sobrecargados y el uso del operador this.
 */
public class Libro {
    String titulo;
    String autor;
    int paginas;

    /**
     * Constructor con parámetros utilizando el operador this para disambiguar.
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Sobrecarga de constructor para libros con páginas por defecto.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 150; // Valor por defecto
    }

    public void mostrarDetalles() {
        System.out.println("-> Libro: '" + titulo + "' escrito por " + autor + " (" + paginas + " páginas)");
    }
}
