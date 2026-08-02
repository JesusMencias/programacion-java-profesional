package UT02_Estructuras_Control_Pruebas.leccion_031_seleccion_condicional_if.src;

public class BadPath {
    public static void main(String[] args) {
        String usuario = "admin";
        String password = "123";
        boolean activo = true;

        if (usuario != null) {
            if (usuario.equals("admin")) {
                if (password != null) {
                    if (password.equals("123")) {
                        if (activo) {
                            System.out.println("Acceso concedido.");
                        } else {
                            System.out.println("Error: Usuario inactivo.");
                        }
                    } else {
                        System.out.println("Error: Password incorrecto.");
                    }
                }
            }
        }
    }
}