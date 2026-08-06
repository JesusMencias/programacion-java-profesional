package UT01_Introduccion_Programacion.leccion_014_encapsulamiento.src;

/**
 * 014. Clase Modelo: CuentaBancaria
 * Objetivo: Demostrar el encapsulamiento de atributos privados mediante getters y setters con validación.
 */
public class CuentaBancaria {
    // Atributos privados (Estado blindado)
    private String titular;
    private double saldo;

    /**
     * Constructor para inicializar la cuenta bancaria.
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        setSaldo(saldoInicial); // Usamos el setter para aplicar la validación inicial
    }

    // --- GETTERS Y SETTERS ---

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter blindado con validación lógica de integridad.
     */
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("[ALERTA] Intento de asignar saldo negativo. Operación rechazada.");
        }
    }
}
