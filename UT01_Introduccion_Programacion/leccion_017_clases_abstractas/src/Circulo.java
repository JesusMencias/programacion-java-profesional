package UT01_Introduccion_Programacion.leccion_017_clases_abstractas.src;

/**
 * 017. Subclase Concreta: Circulo
 * Objetivo: Implementar obligatoriamente los contratos de la clase abstracta Figura.
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
