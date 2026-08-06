package UT01_Introduccion_Programacion.leccion_016_polimorfismo.src;

/**
 * 016. Subclase: Gato (Sobrescribe el comportamiento heredado)
 */
public class Gato extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("-> El gato maúlla: ¡Miau, miau!");
    }
}
