package UT01_Introduccion_Programacion.leccion_003_paradigmas_estructurado_vs_poo.src;

/**
 * CLEAN CODE: Enfoque Orientado a Objetos (POO).
 * Encapsulamiento de estado y comportamiento en una misma entidad.
 */
public class CleanSolution {

    static class CuentaBancaria {
        private final String titular;
        private double balance;

        public CuentaBancaria(String titular, double balanceInicial) {
            this.titular = titular;
            this.balance = Math.max(0.0, balanceInicial);
        }

        public void depositar(double monto) {
            if (monto > 0) this.balance += monto;
        }

        public double getBalance() {
            return balance;
        }

        public String getTitular() {
            return titular;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 500.0);
        cuenta.depositar(200.0);
        System.out.println("Titular: " + cuenta.getTitular() + " | Balance Seguro: " + cuenta.getBalance());
    }
}