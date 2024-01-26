package lab.pkg2p2_mariasinclair;

import java.util.Scanner;

public class Lab2p2_MariaSinclair {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Usuario profesor = new Usuario("profesor@correo.com", "contrasena1", "Profesor");
        Usuario estudiante = new Usuario("estudiante@correo.com", "contrasena2", "Estudiante");
        Usuario bibliotecario = new Usuario("bibliotecario@correo.com", "contrasena3", "Bibliotecario");

        // Ejemplo de inicio de sesión como profesor
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su correo: ");
        String correoIngresado = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseñaIngresada = scanner.nextLine();

        if (profesor.verificarCredenciales(correoIngresado, contraseñaIngresada)) {
            System.out.println("Inicio de sesion exitoso como " + profesor.getTipoUsuario() + ".");
        } else {
            System.out.println("Correo o contraseña incorrectos.");
        }

        int caso = 0;
        boolean repetir = true;
        while (repetir) {
            System.out.println("-------MENU-------");
            System.out.println("1. Listar Recursos. ");
            System.out.println("2. Crear recurso. ");
            System.out.println("3. Eliminar Recurso.");
            System.out.println("4. Modificar recurso. ");
            System.out.println("5. Salir del programa. ");
            System.out.print(" Elige una opcion: ");
            caso = leer.nextInt();

            switch (caso) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Finalizo su programa.");
                    repetir = false;

            }//Fin de los casos.
        }//Fin del repetidor.
    }//Fin del main.
}//Fin de la clase.
