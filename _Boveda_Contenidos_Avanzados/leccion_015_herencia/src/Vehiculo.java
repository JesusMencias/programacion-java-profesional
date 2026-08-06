package UT01_Introduccion_Programacion.leccion_015_herencia.src;

/**
 * 015. Superclase: Vehiculo
 * Objetivo: Definir atributos y comportamientos generales compartidos por la jerarquía.
 */
public class Vehiculo {
    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("-> Vehículo marca: " + marca + ", Velocidad: " + velocidad + " km/h");
    }
}
