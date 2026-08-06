package UT01_Introduccion_Programacion.leccion_013_ambito_variables_scope.src;

/**
 * 013. Ámbito de variables (scope): locales vs. de instancia
 * Objetivo: Demostrar empíricamente la diferencia de visibilidad y ciclo de vida 
 *           entre una variable de instancia (atributo) y una variable local.
 */
public class AmbitoVariablesDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: ÁMBITO DE VARIABLES (SCOPE)");
        System.out.println("==================================================");

        try {
            // Instanciación del objeto contenedor
            Vehiculo miVehiculo = new Vehiculo("Tesla Model 3");
            miVehiculo.mostrarDetalles();

            // Llamada a método con variable local
            miVehiculo.calcularAutonomia(500);

            // ERROR INTENCIONAL DE COMPILACIÓN (Conceptual):
            // System.out.println(litrosCombustible); -> Fuera de ámbito (No existe aquí)

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al evaluar el ámbito de las variables: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}

/**
 * Clase auxiliar para ilustrar variables de instancia y locales
 */
class Vehiculo {
    // 1. VARIABLE DE INSTANCIA (Atributo): Pertenece al objeto en el Heap
    private String modelo;

    public Vehiculo(String modelo) {
        this.modelo = modelo; // 'modelo' es accesible en toda la instancia
    }

    public void mostrarDetalles() {
        // Acceso válido a la variable de instancia
        System.out.println("-> [Instancia] Vehículo registrado: " + this.modelo);
    }

    public void calcularAutonomia(int kilometrosTotales) {
        // 2. VARIABLE LOCAL: Declarada dentro del método (vive solo en este bloque)
        double consumoEstimadoPorKm = 0.15; 
        double energiaRequerida = kilometrosTotales * consumoEstimadoPorKm;

        System.out.println("-> [Local] Para " + kilometrosTotales + " km se requieren " + energiaRequerida + " kWh.");
        
        // 'energiaRequerida' y 'consumoEstimadoPorKm' mueren al terminar este método.
    }
}
