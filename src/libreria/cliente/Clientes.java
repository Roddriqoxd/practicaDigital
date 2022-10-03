package libreria.cliente;

import java.util.Date;

public class Clientes {
    //nombres, apellidos, numero de CI, extension de CI, indicar si es un cliente nuevo
    // (se considera un cliente nuevo solo si hizo una compra, si hace otra compra,
    // se considera como cliente antiguo), libros comprados, fecha de nacimiento, cooreo
    private String nombre;
    private String apellidos;
    private long CI;
    private boolean antiguedad;
    private int librosComprados;
    private String fecha;
    private String correo; //convertir opcional

    public Clientes(String nombre, String apellidos, long CI, boolean antiguedad, int librosComprados, String fecha, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.CI = CI;
        this.antiguedad = antiguedad;
        this.librosComprados = librosComprados;
        this.fecha = fecha;
        this.correo =correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getCI() {
        return CI;
    }

    public void setCI(long CI) {
        this.CI = CI;
    }

    public boolean getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(boolean antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getLibrosComprados() {
        return librosComprados;
    }

    public void setLibrosComprados(int librosComprados) {
        this.librosComprados = librosComprados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
