package lab.pkg2p2_mariasinclair;

public class Cursos {

    private String titulo3;
    private String instructor;
    private String duracion;
    private String plataforma;

    //Constructor
    public Cursos(String titulo3, String instructor, String duracion, String plataforma) {
        this.titulo3 = titulo3;
        this.instructor = instructor;
        this.duracion = duracion;
        this.plataforma = plataforma;
    }

    // Getters
    public String getTitulo3() {
        return titulo3;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    // Setters
    public void setTitulo3(String titulo3) {
        this.titulo3 = titulo3;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    // ToString para representación legible (si es necesario)
    @Override
    public String toString() {
        return "Conferencias: \n"
                + "Titulo: \n" + titulo3
                + "Instructor: \n" + instructor
                + "Duracion de curso: \n: " + duracion
                + "Plataforma: " + plataforma;
    }

}
