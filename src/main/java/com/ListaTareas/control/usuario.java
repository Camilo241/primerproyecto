package src.main.java.com.ListaTareas.control;

public class usuario {
    private String nombre;
    private String  correo;
    private String contraseña;
    private String historial;
    
    public usuario(String nombre, String correo, String contraseña, String historial) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.historial = historial;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getHistorial() {
        return historial;
    }
    public void setHistorial(String historial) {
        this.historial = historial;
    }
}
