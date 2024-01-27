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

        Articulos articuloEjemplo = new Articulos("Inteligencia Artificial", "Autor Anonimo", "Tecnologia", "26/09/2005", "Acceso Publico");
        Libros libroEjemplo = new Libros("Mas alla del sol", "Gabriel Garcia Marquez", "Realismo", "1967", "Disponible en Biblioteca");
        Cursos cursoEjemplo = new Cursos("Desarrollo Web Completo", "John Doe", "8 semanas", "Plataforma Educativa Online");
        Conferencias conferenciaEjemplo = new Conferencias("Innovacion Tecnologica", "Dr. Maria Lopez", "15/02/2022", 90, "Enlace Privado");

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

            Usuario usuario = null;

            for (Usuario u : listaDeUsuarios) {
                if (u.verificarUsuario(correoIngresado, contraseñaIngresada)) {
                    usuario = u;
                    break;
                }
            }

            if (usuario != null) {
                System.out.println("Inicio de sesion exitoso como " + usuario.getTipoUsuario() + ".");
                inicioSesionExitoso = true;

                boolean repetir = true;

                while (repetir) {
                    System.out.println("-------MENU-------");
                    System.out.println("1. Listar Recursos. ");

                    if (usuario.getTipoUsuario().equals("Estudiante")) {
                        System.out.println("2. Crear recurso. ");
                        System.out.println("3. Eliminar Recurso.");
                        System.out.println("4. Modificar recurso.");
                    } else if (usuario.getTipoUsuario().equals("Profesor")) {
                        System.out.println("2. Crear recurso. ");
                        System.out.println("3. Eliminar Recurso.");
                        System.out.println("4. Modificar recurso.");
                    } else {
                        System.out.println("2. Crear recurso. ");
                        System.out.println("3. Eliminar Recurso.");
                        System.out.println("4. Modificar recurso.");
                    }

                    System.out.println("5. Salir del programa. ");
                    System.out.print(" Elige una opcion: ");
                    int caso = leer.nextInt();
                    leer.nextLine();

                    switch (caso) {
                        case 1:
                            ListarTodos();
                            break;
                        case 2:
                            if (usuario.getTipoUsuario().equals("Estudiante")) {
                                System.out.println("Acceso no permitido a Crear Recurso.");
                            } else {
                                CrearRecurso();
                            }
                            break;
                        case 3:
                            if (usuario.getTipoUsuario().equals("Estudiante") || usuario.getTipoUsuario().equals("Profesor")) {
                                System.out.println("Acceso no permitido a Eliminar Recurso.");
                            } else {
                                EliminarRecurso();
                            }
                            break;
                        case 4:
                            if (usuario.getTipoUsuario().equals("Estudiante") || usuario.getTipoUsuario().equals("Profesor")) {
                                System.out.println("Acceso no permitido a Modificar Recurso.");
                            } else {
                                ModificarRecurso();
                            }
                            break;
                        case 5:
                            System.out.println("Finalizo su programa.");
                            System.out.println("Este lab casi me provoca un derrame cerebral :(");
                            repetir = false;
                            break;
                        default:
                            System.out.println("Opción no válida. Intente nuevamente.");
                    }
                }

            } else {
                System.out.println("Correo o clave incorrectos. Intente nuevamente.");
            }
        } while (!inicioSesionExitoso);

    }//Fin del main.

    public static void ListarTodos() {
        // Listar Artículos
        System.out.println("------ Articulos ------");
        for (int i = 0; i < listaDeArticulos.size(); i++) {
            Articulos articulo = listaDeArticulos.get(i);
            System.out.println(i + 1 + "). " + articulo.toString());
            System.out.println("-----------------------");
        }

        // Listar Libros
        System.out.println("-------- Libros --------");
        for (int i = 0; i < listaDeLibros.size(); i++) {
            Libros libro = listaDeLibros.get(i);
            System.out.println(i + 1 + "). " + libro.toString());
            System.out.println("-----------------------\n");
        }

        // Listar Cursos
        System.out.println("-------- Cursos --------");
        for (int i = 0; i < listaDeCursos.size(); i++) {
            Cursos curso = listaDeCursos.get(i);
            System.out.println(i + 1 + "). " + curso.toString());
            System.out.println("-----------------------\n");
        }

        // Listar Conferencias
        System.out.println("----- Conferencias -----");
        for (int i = 0; i < listaDeConferencias.size(); i++) {
            Conferencias conferencia = listaDeConferencias.get(i);
            System.out.println(i + 1 + "). " + conferencia.toString());
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
        System.out.print("Elige una opcion:");

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
        System.out.print("Elige una opcion: ");

        int opcionTipoRecurso = leer.nextInt();
        leer.nextLine();

        switch (opcionTipoRecurso) {
            case 1:
                ListarArticulos();
                System.out.println("Ingrese el numero del articulo a eliminar:");
                int indiceArticulo = leer.nextInt();
                if (indiceArticulo >= 1 && indiceArticulo <= listaDeArticulos.size()) {
                    listaDeArticulos.remove(indiceArticulo - 1);
                    System.out.println("Articulo eliminado correctamente.");
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
            System.out.println(i + 1 + "). " + articulo.toString());
            System.out.println("-----------------------");
        }
    }

    public static void ListarLibros() {
        System.out.println("-------- Libros --------");
        for (int i = 0; i < listaDeLibros.size(); i++) {
            Libros libro = listaDeLibros.get(i);
            System.out.println(i + 1 + "). " + libro.toString());
            System.out.println("-----------------------\n");
        }
    }

    public static void ListarCursos() {
        System.out.println("-------- Cursos --------");
        for (int i = 0; i < listaDeCursos.size(); i++) {
            Cursos curso = listaDeCursos.get(i);
            System.out.println(i + 1 + "). " + curso.toString());
            System.out.println("-----------------------\n");
        }
    }

    public static void ListarConferencias() {
        System.out.println("----- Conferencias -----");
        for (int i = 0; i < listaDeConferencias.size(); i++) {
            Conferencias conferencia = listaDeConferencias.get(i);
            System.out.println(i + 1 + "). " + conferencia.toString());
            System.out.println("-----------------------\n");
        }
    }

    public static void ModificarRecurso() {
        System.out.println("------ Modificar Recurso ------");
        System.out.println("Ingrese el tipo de recurso a modificar:");
        System.out.println("1. Articulo");
        System.out.println("2. Libro");
        System.out.println("3. Curso");
        System.out.println("4. Conferencia");

        int opcionTipoRecurso = leer.nextInt();
        leer.nextLine();

        switch (opcionTipoRecurso) {
            case 1:
                ListarArticulos();
                System.out.println("Ingrese el numero del articulo a modificar:");
                int indiceArticulo = leer.nextInt();
                leer.nextLine();

                if (indiceArticulo >= 1 && indiceArticulo <= listaDeArticulos.size()) {
                    Articulos articuloSeleccionado = listaDeArticulos.get(indiceArticulo - 1);

                    System.out.println("Ingrese el nuevo titulo del articulo:");
                    String nuevoTitulo = leer.nextLine();
                    articuloSeleccionado.setTitulo(nuevoTitulo);

                    System.out.println("Ingrese el nuevo autor del articulo:");
                    String nuevoCreador = leer.nextLine();
                    articuloSeleccionado.setCreador(nuevoCreador);

                    System.out.println("Ingrese el nuevo tema del articulo:");
                    String nuevoTema = leer.nextLine();
                    articuloSeleccionado.setTema(nuevoTema);

                    System.out.println("Ingrese la nueva fecha del articulo:");
                    String nuevaFecha = leer.nextLine();
                    articuloSeleccionado.setFecha(nuevaFecha);

                    System.out.println("Ingrese el nuevo acceso en linea del articulo:");
                    String nuevoAcceso = leer.nextLine();
                    articuloSeleccionado.setAcceso(nuevoAcceso);

                    System.out.println("Articulo modificado correctamente.");
                } else {
                    System.out.println("Numero de articulo no valido.");
                }
                break;

            case 2:
                ListarLibros();
                System.out.println("Ingrese el numero del libro a modificar:");
                int indiceLibro = leer.nextInt();
                leer.nextLine();

                if (indiceLibro >= 1 && indiceLibro <= listaDeLibros.size()) {
                    Libros libroSeleccionado = listaDeLibros.get(indiceLibro - 1);

                    System.out.println("Ingrese el nuevo titulo del libro:");
                    String nuevoTituloLibro = leer.nextLine();
                    libroSeleccionado.setTitulo(nuevoTituloLibro);

                    System.out.println("Ingrese el nuevo autor del libro:");
                    String nuevoAutorLibro = leer.nextLine();
                    libroSeleccionado.setAutor(nuevoAutorLibro);

                    System.out.println("Ingrese el nuevo genero del libro:");
                    String nuevoGeneroLibro = leer.nextLine();
                    libroSeleccionado.setGenero(nuevoGeneroLibro);

                    System.out.println("Ingrese la nueva fecha de publicacion del libro:");
                    String nuevaPublicacionLibro = leer.nextLine();
                    libroSeleccionado.setPublicacion(nuevaPublicacionLibro);

                    System.out.println("Ingrese la nueva disponibilidad del libro:");
                    String nuevaDisponibilidadLibro = leer.nextLine();
                    libroSeleccionado.setDisponibilidad(nuevaDisponibilidadLibro);

                    System.out.println("Libro modificado correctamente.");
                } else {
                    System.out.println("Numero de libro no valido.");
                }
                break;

            case 3:
                ListarCursos();
                System.out.println("Ingrese el numero del curso a modificar:");
                int indiceCurso = leer.nextInt();
                leer.nextLine();

                if (indiceCurso >= 1 && indiceCurso <= listaDeCursos.size()) {
                    Cursos cursoSeleccionado = listaDeCursos.get(indiceCurso - 1);

                    System.out.println("Ingrese el nuevo titulo del curso:");
                    String nuevoTituloCurso = leer.nextLine();
                    cursoSeleccionado.setTitulo3(nuevoTituloCurso);

                    System.out.println("Ingrese el nuevo instructor del curso:");
                    String nuevoInstructorCurso = leer.nextLine();
                    cursoSeleccionado.setInstructor(nuevoInstructorCurso);

                    System.out.println("Ingrese la nueva duracion del curso:");
                    String nuevaDuracionCurso = leer.nextLine();
                    cursoSeleccionado.setDuracion(nuevaDuracionCurso);

                    System.out.println("Ingrese la nueva plataforma del curso:");
                    String nuevaPlataformaCurso = leer.nextLine();
                    cursoSeleccionado.setPlataforma(nuevaPlataformaCurso);

                    System.out.println("Curso modificado correctamente.");
                } else {
                    System.out.println("Numero de curso no valido.");
                }
                break;

            case 4:
                ListarConferencias();
                System.out.println("Ingrese el numero de la conferencia a modificar:");
                int indiceConferencia = leer.nextInt();
                leer.nextLine();

                if (indiceConferencia >= 1 && indiceConferencia <= listaDeConferencias.size()) {
                    Conferencias conferenciaSeleccionada = listaDeConferencias.get(indiceConferencia - 1);

                    System.out.println("Ingrese el nuevo titulo de la conferencia:");
                    String nuevoTituloConferencia = leer.nextLine();
                    conferenciaSeleccionada.setTitulo4(nuevoTituloConferencia);

                    System.out.println("Ingrese el nuevo conferencista de la conferencia:");
                    String nuevoConferencista = leer.nextLine();
                    conferenciaSeleccionada.setConferencista(nuevoConferencista);

                    System.out.println("Ingrese la nueva fecha de la conferencia:");
                    String nuevaFechaConferencia = leer.nextLine();
                    conferenciaSeleccionada.setDia(nuevaFechaConferencia);

                    System.out.println("Ingrese la nueva duracion de la conferencia en minutos:");
                    int nuevaDuracionConferencia = leer.nextInt();
                    leer.nextLine();
                    conferenciaSeleccionada.setTiempo(nuevaDuracionConferencia);

                    System.out.println("Ingrese el nuevo enlace de acceso de la conferencia:");
                    String nuevoAccesoConferencia = leer.nextLine();
                    conferenciaSeleccionada.setAcceso(nuevoAccesoConferencia);

                    System.out.println("Conferencia modificada correctamente.");
                } else {
                    System.out.println("Numero de conferencia no valido.");
                }
                break;

            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }

}//Fin de la clase.
