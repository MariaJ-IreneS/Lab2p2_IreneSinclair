package lab.pkg2p2_mariasinclair;

import java.util.ArrayList;

public class Usuario {

    private String correo;
    private String contraseña;
    private ArrayList<String> tipo = new ArrayList<>();

    public Usuario(String correo, String contraseña, String tipoUsuario) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipo.add(tipoUsuario);
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }
    
    

    public boolean verificarUsuario(String correo, String contraseña) {
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    public String getTipoUsuario() {
        return tipo.size() == 0 ? "Sin Tipo" : tipo.get(0);
    }

}
