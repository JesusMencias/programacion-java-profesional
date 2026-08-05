package UT01_Introduccion_Programacion.leccion_015_herencia.src;

/**
 * 015. Subclase: CocheDeportivo (Hereda de Vehiculo)
 * Objetivo: Extender la superclase añadiendo atributos y lógica especializada.
 */
public class CocheDeportivo extends Vehiculo {
    private boolean turboActivado;

    public CocheDeportivo(String marca, int velocidad, boolean turboActivado) {
        super(marca, velocidad); // Invocación explícita al constructor del padre
        this.turboActivado = turboActivado;
    }

    public void activarTurbo() {
        this.turboActivado = true;
        System.out.println("-> [TURBO] ¡Aceleración máxima activada en el " + marca + "!");
    }
}
