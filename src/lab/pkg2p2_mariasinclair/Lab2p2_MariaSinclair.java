package lab.pkg2p2_mariasinclair;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2p2_MariaSinclair {

    public static Scanner leer = new Scanner(System.in);
    private static ArrayList<Articulos> listaDeArticulos = new ArrayList<>();
    private static ArrayList<Libros> listaDeLibros = new ArrayList<>();
    private static ArrayList<Cursos> listaDeCursos = new ArrayList<>();
    private static ArrayList<Conferencias> listaDeConferencias = new ArrayList<>();
    private static ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();

    public static void main(String[] args) {

        Usuario profesor = new Usuario("profesor@correo.com", "claveprofesor", "Profesor");
        Usuario estudiante = new Usuario("estudiante@correo.com", "claveestudiante", "Estudiante");
        Usuario bibliotecario = new Usuario("bibliotecario@correo.com", "clavebibliotecario", "Bibliotecario");

        listaDeUsuarios.add(profesor);
        listaDeUsuarios.add(estudiante);
        listaDeUsuarios.add(bibliotecario);

        Articulos articuloEjemplo = new Articulos("Inteligencia Artificial", "Autor Anonimo", "Tecnologia", "2022-01-26", "Acceso Publico");
        Libros libroEjemplo = new Libros("Mas alla del sol", "Gabriel Garcia Marquez", "Realismo Magico", "1967", "Disponible en Biblioteca");
        Cursos cursoEjemplo = new Cursos("Desarrollo Web Completo", "John Doe", "8 semanas", "Plataforma Educativa Online");
        Conferencias conferenciaEjemplo = new Conferencias("Innovacion Tecnologica", "Dr. Maria Lopez", "2022-02-15", 90, "Enlace Privado");

        listaDeArticulos.add(articuloEjemplo);
        listaDeLibros.add(libroEjemplo);
        listaDeCursos.add(cursoEjemplo);
        listaDeConferencias.add(conferenciaEjemplo);

        boolean inicioSesionExitoso = false;

        do {
            System.out.print("Ingrese su correo: ");
            String correoIngresado = leer.nextLine();

            System.out.print("Ingrese su clave: ");
            String contraseñaIngresada = leer.nextLine();

            if (profesor.verificarUsuario(correoIngresado, contraseñaIngresada)) {
                System.out.println("Inicio de sesion exitoso como " + profesor.getTipoUsuario() + ".");
                inicioSesionExitoso = true;
            } else if (estudiante.verificarUsuario(correoIngresado, contraseñaIngresada)) {
                System.out.println("Inicio de sesion exitoso como " + estudiante.getTipoUsuario() + ".");
                inicioSesionExitoso = true;
            } else if (bibliotecario.verificarUsuario(correoIngresado, contraseñaIngresada)) {
                System.out.println("Inicio de sesion exitoso, como: " + bibliotecario.getTipoUsuario() + ".");
                inicioSesionExitoso = true;
            } else {
                System.out.println("Correo o clave incorrectos. Intente nuevamente.");
            }
        } while (!inicioSesionExitoso);

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
                    ListarTodos();
                    break;
                case 2:
                    CrearRecurso();
                    break;
                case 3:
                    EliminarRecurso();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Finalizo su programa.");
                    repetir = false;

            }//Fin de los casos.
        }//Fin del repetidor.
    }//Fin del main.

    public static void ListarTodos() {
        // Listar Artículos
        System.out.println("------ Articulos ------");
        for (int i = 0; i < listaDeArticulos.size(); i++) {
            Articulos articulo = listaDeArticulos.get(i);
            System.out.println(i + 1 + ")." + articulo.toString());
            System.out.println("-----------------------");
        }

        // Listar Libros
        System.out.println("-------- Libros --------");
        for (int i = 0; i < listaDeLibros.size(); i++) {
            Libros libro = listaDeLibros.get(i);
            System.out.println(i + 1 + ")." + libro.toString());
            System.out.println("-----------------------\n");
        }

        // Listar Cursos
        System.out.println("-------- Cursos --------");
        for (int i = 0; i < listaDeCursos.size(); i++) {
            Cursos curso = listaDeCursos.get(i);
            System.out.println(i + 1 + ")." + curso.toString());
            System.out.println("-----------------------\n");
        }

        // Listar Conferencias
        System.out.println("----- Conferencias -----");
        for (int i = 0; i < listaDeConferencias.size(); i++) {
            Conferencias conferencia = listaDeConferencias.get(i);
            System.out.println(i + 1 + ")." + conferencia.toString());
            System.out.println("-----------------------\n");
        }
    }

    public static void CrearRecurso() {
        System.out.println("------ Crear Recurso ------");
        System.out.println("Seleccione el tipo de recurso:");
        System.out.println("1. Articulo");
        System.out.println("2. Libro");
        System.out.println("3. Curso");
        System.out.println("4. Conferencia");

        int opcionTipoRecurso = leer.nextInt();
        leer.nextLine();

        switch (opcionTipoRecurso) {
            case 1:
                System.out.println("Ingrese el titulo del articulo:");
                String tituloArticulo = leer.nextLine();
                System.out.println("Ingrese el creador del articulo:");
                String creadorArticulo = leer.nextLine();
                System.out.println("Ingrese el tema del articulo:");
                String temaArticulo = leer.nextLine();
                System.out.println("Ingrese la fecha del articulo:");
                String fechaArticulo = leer.nextLine();
                System.out.println("Ingrese el acceso en linea del articulo:");
                String accesoArticulo = leer.nextLine();

                Articulos nuevoArticulo = new Articulos(tituloArticulo, creadorArticulo, temaArticulo, fechaArticulo, accesoArticulo);
                listaDeArticulos.add(nuevoArticulo);
                System.out.println("Articulo creado exitosamente.");
                break;

            case 2:
                System.out.println("Ingrese el titulo del libro:");
                String tituloLibro = leer.nextLine();
                System.out.println("Ingrese el autor del libro:");
                String autorLibro = leer.nextLine();
                System.out.println("Ingrese el genero del libro:");
                String generoLibro = leer.nextLine();
                System.out.println("Ingrese la fecha de publicacion del libro:");
                String publicacionLibro = leer.nextLine();
                System.out.println("Ingrese la disponibilidad del libro:");
                String disponibilidadLibro = leer.nextLine();

                Libros nuevoLibro = new Libros(tituloLibro, autorLibro, generoLibro, publicacionLibro, disponibilidadLibro);
                listaDeLibros.add(nuevoLibro);
                System.out.println("Libro creado exitosamente.");
                break;

            case 3:
                System.out.println("Ingrese el titulo del curso:");
                String tituloCurso = leer.nextLine();
                System.out.println("Ingrese el instructor del curso:");
                String instructorCurso = leer.nextLine();
                System.out.println("Ingrese la duracion del curso:");
                String duracionCurso = leer.nextLine();
                System.out.println("Ingrese la plataforma del curso:");
                String plataformaCurso = leer.nextLine();

                Cursos nuevoCurso = new Cursos(tituloCurso, instructorCurso, duracionCurso, plataformaCurso);
                listaDeCursos.add(nuevoCurso);
                System.out.println("Curso creado exitosamente.");
                break;

            case 4:
                System.out.println("Ingrese el titulo de la conferencia:");
                String tituloConferencia = leer.nextLine();
                System.out.println("Ingrese el conferencista de la conferencia:");
                String conferencistaConferencia = leer.nextLine();
                System.out.println("Ingrese la fecha de la conferencia:");
                String fechaConferencia = leer.nextLine();
                System.out.println("Ingrese la duracion de la conferencia en minutos(solo numero):");
                int duracionConferencia = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese el enlace de acceso de la conferencia:");
                String accesoConferencia = leer.nextLine();

                Conferencias nuevaConferencia = new Conferencias(tituloConferencia, conferencistaConferencia, fechaConferencia, duracionConferencia, accesoConferencia);
                listaDeConferencias.add(nuevaConferencia);
                System.out.println("Conferencia creada exitosamente.");
                break;

            default:
                System.out.println("Opcion no válida.");
                break;
        }
    }

    public static void EliminarRecurso() {
        System.out.println("------ Eliminar Recurso ------");
        System.out.println("Ingrese el tipo de recurso a eliminar:");
        System.out.println("1.Articulo");
        System.out.println("2.Libro");
        System.out.println("3.Curso");
        System.out.println("4.Conferencia");

        int opcionTipoRecurso = leer.nextInt();
        leer.nextLine();

        switch (opcionTipoRecurso) {
            case 1:
                ListarArticulos();
                System.out.println("Ingrese el numero del articulo a eliminar:");
                int indiceArticulo = leer.nextInt();
                if (indiceArticulo >= 1 && indiceArticulo <= listaDeArticulos.size()) {
                    listaDeArticulos.remove(indiceArticulo - 1);
                    System.out.println("Artículo eliminado correctamente.");
                } else {
                    System.out.println("Numero de articulo no valido.");
                }
                break;

            case 2:
                ListarLibros();
                System.out.println("Ingrese el numero del libro a eliminar:");
                int indiceLibro = leer.nextInt();
                if (indiceLibro >= 1 && indiceLibro <= listaDeLibros.size()) {
                    listaDeLibros.remove(indiceLibro - 1);
                    System.out.println("Libro eliminado correctamente.");
                } else {
                    System.out.println("Numero de libro no valido.");
                }
                break;

            case 3:
                ListarCursos();
                System.out.println("Ingrese el numero del curso a eliminar:");
                int indiceCurso = leer.nextInt();
                if (indiceCurso >= 1 && indiceCurso <= listaDeCursos.size()) {
                    listaDeCursos.remove(indiceCurso - 1);
                    System.out.println("Curso eliminado correctamente.");
                } else {
                    System.out.println("Numero de curso no valido.");
                }
                break;

            case 4:
                ListarConferencias();
                System.out.println("Ingrese el numero de la conferencia a eliminar:");
                int indiceConferencia = leer.nextInt();
                if (indiceConferencia >= 1 && indiceConferencia <= listaDeConferencias.size()) {
                    listaDeConferencias.remove(indiceConferencia - 1);
                    System.out.println("Conferencia eliminada correctamente.");
                } else {
                    System.out.println("Numero de conferencia no válido.");
                }
                break;

            default:
                System.out.println("Opcion no válida.");
                break;
        }
    }

    public static void ListarArticulos() {
        System.out.println("------ Articulos ------");
        for (int i = 0; i < listaDeArticulos.size(); i++) {
            Articulos articulo = listaDeArticulos.get(i);
            System.out.println(i + 1 + ")." + articulo.toString());
            System.out.println("-----------------------");
        }
    }

    public static void ListarLibros() {
        System.out.println("-------- Libros --------");
        for (int i = 0; i < listaDeLibros.size(); i++) {
            Libros libro = listaDeLibros.get(i);
            System.out.println(i + 1 + ")." + libro.toString());
            System.out.println("-----------------------\n");
        }
    }

    public static void ListarCursos() {
        System.out.println("-------- Cursos --------");
        for (int i = 0; i < listaDeCursos.size(); i++) {
            Cursos curso = listaDeCursos.get(i);
            System.out.println(i + 1 + ")." + curso.toString());
            System.out.println("-----------------------\n");
        }
    }

    public static void ListarConferencias() {
        System.out.println("----- Conferencias -----");
        for (int i = 0; i < listaDeConferencias.size(); i++) {
            Conferencias conferencia = listaDeConferencias.get(i);
            System.out.println(i + 1 + ")." + conferencia.toString());
            System.out.println("-----------------------\n");
        }
    }
}//Fin de la clase.
