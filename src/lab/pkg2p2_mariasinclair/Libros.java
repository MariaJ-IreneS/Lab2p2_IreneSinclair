package lab.pkg2p2_mariasinclair;

import java.util.Date;

class Libros {

    private String titulo;
    private String autor;
    private String genero;
    private String publicacion;
    private String disponibilidad;

    public Libros(String titulo, String autor, String genero, String publicacion, String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.publicacion = publicacion;
        this.disponibilidad = disponibilidad;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro: \n"
                + "\nTitulo: " + titulo
                + "\nAutor: " + autor
                + "\nGenero: " + genero
                + "\nFecha de Publicacion: " + publicacion
                + "\nDisponibilidad: " + disponibilidad;
    }
}
