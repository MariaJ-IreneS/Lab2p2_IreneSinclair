package lab.pkg2p2_mariasinclair;

import java.util.Scanner;

public class Lab2p2_MariaSinclair {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int caso = 0;
        boolean repetir = true;
        while (repetir) {
            System.out.println("-------MENU-------");
            System.out.println("1. Listar Recursos. ");
            System.out.println("2. Crear recurso. ");
            System.out.println("3. Eliminar Recurso.");
            System.out.println("4. Modificar recurso. ");
            System.out.println("Salir del programa. ");
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
