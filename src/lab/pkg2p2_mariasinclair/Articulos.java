package lab.pkg2p2_mariasinclair;

import java.util.Date;

public class Articulos {

    private String titulo2;
    private String creador;
    private String tema;
    private String fecha;
    private String acceso;

    // Constructor
    public Articulos(String titulo2, String creador, String tema, String fecha, String acceso) {
        this.titulo2 = titulo2;
        this.creador = creador;
        this.tema = tema;
        this.fecha = fecha;
        this.acceso = acceso;
    }

    // Métodos de acceso
    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo(String titulo2) {
        this.titulo2 = titulo2;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    // Ma
    @Override
    public String toString() {
        return "Articulo: \n"
                + "\nTitulo del libro: " + titulo2
                + "\nCreador: " + creador
                + "\nTema: " + tema
                + "\nFecha: " + fecha
                + "\nAcceso en Linea:'" + acceso;
    }
}
