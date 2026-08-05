package UT01_Introduccion_Programacion.leccion_017_clases_abstractas.src;

/**
 * 017. Clase Abstracta: Figura
 * Objetivo: Establecer una plantilla base con contratos abstractos obligatorios.
 */
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    // Método abstracto (sin cuerpo, obliga su implementación en las subclases)
    public abstract double calcularArea();

    // Método concreto compartido
    public void mostrarColor() {
        System.out.println("-> Color de la figura: " + color);
    }
}
