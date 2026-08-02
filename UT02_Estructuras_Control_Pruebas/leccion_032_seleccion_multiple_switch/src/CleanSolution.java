package UT02_Estructuras_Control_Pruebas.leccion_032_seleccion_multiple_switch.src;

public class CleanSolution {
    public enum Figura { CUADRADO, TRIANGULO, CIRCULO, PENTAGONO }

    public static void main(String[] args) {
        Figura figuraSeleccionada = Figura.CUADRADO;

        String descripcion = switch (figuraSeleccionada) {
            case CUADRADO -> "Área de Cuadrado: Lado ^ 2";
            case TRIANGULO -> "Área de Triángulo: (Base * Altura) / 2";
            case CIRCULO -> "Área de Círculo: PI * Radio ^ 2";
            case PENTAGONO -> "Área de Pentágono: (Perímetro * Apotema) / 2";
        };

        System.out.println(descripcion);
    }
}