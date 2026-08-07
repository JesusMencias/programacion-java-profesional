package UT01_Introduccion_Programacion.leccion_022_incremento_decremento.src;

/**
 * 022. Incremento y decremento: prefijo (++x) vs. postfijo (x++)
 * Objetivo: Demostrar empíricamente la diferencia en la evaluación de expresiones 
 *           usando operadores unarios en modo prefijo y postfijo.
 */
public class IncrementoDecrementoDemostracion {

    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN: PREFIJO VS. POSTFIJO");
        System.out.println("==================================================");

        try {
            // 1. MODO POSTFIJO (x++)
            int x = 5;
            System.out.println("-> Inicial: x = " + x);
            int y = x++; // Primero asigna x a y, luego incrementa x
            System.out.println("-> Tras postfijo (x++): y = " + y + ", x = " + x);

            // 2. MODO PREFIJO (++x)
            int a = 5;
            int b = ++a; // Primero incrementa a, luego asigna a b
            System.out.println("-> Tras prefijo (++a):  b = " + b + ", a = " + a);

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar operadores unarios: " + e.getMessage());
        }
        
        System.out.println("==================================================");
    }
}
