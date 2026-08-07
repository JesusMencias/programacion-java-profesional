package UT01_Introduccion_Programacion.leccion_030_entrada_salida_scanner.src;

import java.util.Scanner;

/**
 * 030. Entrada/salida por consola: System.out, System.err y Scanner completo
 * Objetivo: Demostrar la separación de flujos de salida (out vs err) y la captura 
 *           interactiva de datos mediante Scanner, previniendo la trampa del búfer.
 */
public class EntradaSalidaDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: E/S POR CONSOLA Y SCANNER");
        System.out.println("==================================================");

        // 1. Demostración de System.out vs System.err
        System.out.println("[INFO] Este es un mensaje normal de salida estándar.");
        System.err.println("[ALERTA] Este es un mensaje canalizado por flujo de errores.");

        // 2. Uso interactivo de Scanner (Simulado/Estructurado para ejecución segura)
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("\n-> Por favor, introduce tu nombre de usuario: ");
            String nombreUsuario = scanner.nextLine(); // Captura de cadena completa

            System.out.print("-> Introduce tu edad actual: ");
            int edad = scanner.nextInt(); // Captura de entero

            // IMPORTANTE: Limpieza del búfer (Newline Trap Fix)
            scanner.nextLine(); 

            System.out.print("-> Introduce tu ciudad de residencia: ");
            String ciudad = scanner.nextLine();

            // Salida consolidada formateada
            System.out.println("\n[REGISTRO EXITOSO]:");
            System.out.println("   Usuario: " + nombreUsuario);
            System.out.println("   Edad:    " + edad + " años");
            System.out.println("   Ciudad:  " + ciudad);

        } catch (Exception e) {
            System.err.println("[ERROR CRÍTICO] Fallo en la lectura por teclado: " + e.getMessage());
        } finally {
            scanner.close(); // Cierre del recurso de E/S
            System.out.println("\n[CIERRE] Flujo de Scanner liberado correctamente.");
        }
        
        System.out.println("==================================================");
    }
}
