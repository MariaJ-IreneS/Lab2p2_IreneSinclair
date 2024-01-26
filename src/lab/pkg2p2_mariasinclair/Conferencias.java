package lab.pkg2p2_mariasinclair;

import java.util.Date;

public class Conferencias {

    private String titulo4;
    private String conferencista;
    private Date dia;
    private int tiempo;
    private String acceso;

    // Constructor
    public Conferencias(String titulo4, String conferencista, Date dia, int tiempo, String acceso) {
        this.titulo4 = titulo4;
        this.conferencista = conferencista;
        this.dia = dia;
        this.tiempo = tiempo;
        this.acceso = acceso;
    }

    // Getters
    public String getTitulo4() {
        return titulo4;
    }

    public String getConferencista() {
        return conferencista;
    }

    public Date getDia() {
        return dia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getAcceso() {
        return acceso;
    }

    // Setters
    public void setTitulo4(String titulo4) {
        this.titulo4 = titulo4;
    }

    public void setConferencista(String conferencista) {
        this.conferencista = conferencista;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Conferencias Proximas: \n"
                + "Programa: \n" + titulo4
                + "Invitado de conferencia: \n" + conferencista
                + "Fecha de conferencia: \n" + dia
                + "Duracion:\n" + tiempo
                + "Enlace de acceso: " + acceso;
    }
}
