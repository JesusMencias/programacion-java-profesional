package UT01_Introduccion_Programacion.leccion_012_identificadores_camelcase.src;

/**
 * 012. Identificadores, palabras reservadas y convención camelCase
 * Objetivo: Demostrar buenas prácticas de nomenclatura aplicando estrictamente 
 *           la convención camelCase en variables y métodos de Java.
 */
public class IdentificadoresDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: CONVENCIÓN CAMELCASE Y NOMENCLATURA");
        System.out.println("==================================================");

        try {
            // Aplicación estricta de camelCase (Lower Camel Case)
            int saldoCuentaBancaria = 1500;
            String nombreCompletoUsuario = "Ana María Pérez";
            boolean esClienteActivo = true;

            System.out.println("-> Titular:       " + nombreCompletoUsuario);
            System.out.println("-> Saldo Actual:  " + saldoCuentaBancaria + " EUR");
            System.out.println("-> ¿Es Activo?:   " + esClienteActivo);

            System.out.println("\n[REGLAS CUMPLIDAS]:");
            System.out.println(" - Sin dígitos numéricos al inicio de los identificadores.");
            System.out.println(" - Cero colisiones con palabras reservadas (ej. class, int).");
            System.out.println(" - Sensible a mayúsculas y minúsculas (case-sensitive).");

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo en la demostración de identificadores: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
