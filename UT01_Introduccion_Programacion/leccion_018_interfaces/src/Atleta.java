package UT01_Introduccion_Programacion.leccion_018_interfaces.src;

/**
 * 018. Clase Concreta: Atleta (Implementa múltiples interfaces - Herencia múltiple de comportamiento)
 */
public class Atleta implements Bebedor, Comedor {
    private String nombre;

    public Atleta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void beber() {
        System.out.println("-> El atleta " + nombre + " está bebiendo agua isotónica.");
    }

    @Override
    public void comer() {
        System.out.println("-> El atleta " + nombre + " está comiendo hidratos de carbono.");
    }
}
