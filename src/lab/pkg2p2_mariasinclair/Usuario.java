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

    public boolean verificarCredenciales(String correo, String contraseña) {
        return this.correo.equals(correo) && this.contraseña.equals(contraseña);
    }

    public String getTipoUsuario() {
        return tipo.isEmpty() ? "Sin Tipo" : tipo.get(0);
    }

}
