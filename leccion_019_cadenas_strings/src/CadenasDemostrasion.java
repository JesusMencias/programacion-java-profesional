package leccion_019_cadenas_strings.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 019. Cadenas de Caracteres y StringBuilder
 * Objetivo: Demostrar la inmutabilidad de String, la eficiencia de StringBuilder y el uso de Regex.
 */
public class CadenasDemostrasion {

    public static void main(String[] args) {
        /*
         * ==========================================
         * MANIPULACIÓN Y RENDIMIENTO DE TEXTO
         * ==========================================
         */
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN DE STRINGS Y MUTABILIDAD");
        System.out.println("==================================================");

        try {
            // 1. Demostración de Inmutabilidad
            String textoOriginal = "Código";
            textoOriginal.concat(" Autodidacta"); // Esto crea un objeto nuevo pero no se reasigna
            System.out.println("-> String original tras concat sin reasignar: " + textoOriginal);

            // 2. Uso eficiente con StringBuilder para alta velocidad
            StringBuilder sb = new StringBuilder("Ingeniería");
            sb.append(" de").append(" Software").append(" Java");
            System.out.println("-> Resultado con StringBuilder: " + sb.toString());

            // 3. Validación mediante Expresiones Regulares (Regex)
            String correoPrueba = "alumno@ies-aguadulce.es";
            String regexEmail = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
            
            Pattern patron = Pattern.compile(regexEmail);
            Matcher matcher = patron.matcher(correoPrueba);

            if (matcher.matches()) {
                System.out.println("-> [REGEX] El correo electrónico '" + correoPrueba + "' es válido.");
            } else {
                System.out.println("-> [REGEX] El correo electrónico no cumple el formato estricto.");
            }

        } catch (Exception e) {
            System.err.println("[ERROR] Fallo al procesar las cadenas de texto: " + e.getMessage());
        }
        System.out.println("==================================================");

        // ⚠️ TRAMPA FRECUENTE: Utilizar el operador de igualdad (==) para comparar 
        // el contenido de dos objetos String evaluará referencias de memoria en lugar 
        // de su valor real. Para comparar texto siempre debe utilizarse el método .equals().
    }
}
