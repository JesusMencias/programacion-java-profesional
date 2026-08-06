package UT01_Introduccion_Programacion.leccion_003_paradigmas_programacion.src;

/**
 * 003. Paradigmas: Estructurado vs. Orientado a Objetos
 * Objetivo: Demostrar la diferencia entre separar datos/funciones y encapsularlos en objetos.
 */
public class ParadigmasDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: ESTRUCTURADO VS. POO EN JAVA");
        System.out.println("==================================================");

        // ---------------------------------------------------------
        // 1. ENFOQUE ESTRUCTURADO (Procedimental)
        // Los datos (variables) están separados del comportamiento (funciones estáticas)
        // ---------------------------------------------------------
        double radioEstructurado = 5.0; 
        double areaEstructurada = calcularAreaCirculo(radioEstructurado);
        System.out.println("[Estructurado] Área calculada: " + areaEstructurada);

        // ---------------------------------------------------------
        // 2. ENFOQUE ORIENTADO A OBJETOS (POO)
        // Datos y comportamiento residen dentro de la entidad "Circulo"
        // ---------------------------------------------------------
        Circulo miCirculo = new Circulo(5.0);
        System.out.println("[POO] Área desde el objeto: " + miCirculo.calcularArea());
        
        System.out.println("==================================================");
    }

    /* =========================================================
     * MÉTODO ESTRUCTURADO AISLADO
     * ========================================================= */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * (radio * radio);
    }
}

/* =========================================================
 * CLASE ORIENTADA A OBJETOS (Molde/Entidad)
 * ========================================================= */
class Circulo {
    // ESTADO (Atributos encapsulados)
    private double radio;

    // CONSTRUCTOR (Inicialización segura)
    public Circulo(double radio) {
        this.radio = radio;
    }

    // COMPORTAMIENTO (Método interno de la entidad)
    public double calcularArea() {
        return Math.PI * (this.radio * this.radio);
    }
}
