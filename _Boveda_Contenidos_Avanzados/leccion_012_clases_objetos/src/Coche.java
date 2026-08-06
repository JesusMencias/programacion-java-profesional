package UT01_Introduccion_Programacion.leccion_012_clases_objetos.src;

/**
 * 012. Clase Molde: Coche
 * Objetivo: Definir la estructura de atributos y comportamiento de una entidad del mundo real.
 */
public class Coche {
    // Atributos de instancia (Estado)
    String marca;
    String modelo;
    int velocidadActual;

    /**
     * Método de instancia que simula una acción del objeto.
     * @param incremento Cantidad de velocidad a acelerar.
     */
    public void acelerar(int incremento) {
        velocidadActual += incremento;
        System.out.println("-> El coche " + marca + " " + modelo + " acelera. Velocidad actual: " + velocidadActual + " km/h");
    }
}
