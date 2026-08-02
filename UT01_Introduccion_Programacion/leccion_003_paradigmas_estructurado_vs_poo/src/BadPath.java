package UT01_Introduccion_Programacion.leccion_003_paradigmas_estructurado_vs_poo.src;

/**
 * BAD PATH: Enfoque Estructurado Frágil (Variables globales y datos desprotegidos).
 */
public class BadPath {
    public static String cuentaTitular = "Juan Pérez";
    public static double cuentaBalance = 500.0;

    public static void main(String[] args) {
        // Modificación directa sin control de encapsulamiento
        cuentaBalance = -9999.0; // Estado corrupto permitido en estructurado puro
        System.out.println("Titular: " + cuentaTitular + " | Balance Corrupto: " + cuentaBalance);
    }
}