package UT01_Introduccion_Programacion.leccion_021_operadores_aritmeticos.src;

public class OperatorsExercises {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("--- Operadores Aritméticos ---");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        int numero = 10;
        numero += 5;
        numero -= 2;
        numero *= 2;
        numero /= 2;
        System.out.println("Resultado asignación compuesta: " + numero);
    }
}