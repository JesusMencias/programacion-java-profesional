package UT02_Estructuras_Control_Pruebas.leccion_033_bucles_while_dowhile.src;

public class BadPath {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Iteración frágil: " + i);
            i++; 
        }
        System.out.println("Valor residual fuera de scope: " + i);
    }
}