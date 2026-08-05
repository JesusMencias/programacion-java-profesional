package UT01_Introduccion_Programacion.leccion_016_polimorfismo.src;

/**
 * 016. Subclase: Perro (Sobrescribe el comportamiento heredado)
 */
public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("-> El perro ladra: ¡Guau, guau!");
    }
}
