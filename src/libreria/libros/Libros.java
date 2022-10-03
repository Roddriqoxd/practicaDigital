package libreria.libros;

public class Libros {
//Libros: titulo, descripcion, autor, genero (comedia, ciencia ficcion, terror, fantasia, ciencia y cuentos),
// editorial, estados de disponibilidad (disponible, no disponible), precio, codigo de libro, stock
// (0 si el libro no esta disponible o numoer > 0 si se encuentra disponible).
    private String titulo;
    private String descripcion;
    private String autor;
    private String genero; //comedia, ciencia ficcion, terror, fantasia, ciencia y cuentos.
    private String editorial;
    private boolean status;
    private double precio;
    private String codigoLibro;
    private int stock;

    public Libros(String titulo, String descripcion, String autor, String genero, String editorial, boolean status, double precio, String codigoLibro, int stock) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.status = status;
        this.precio = precio;
        this.codigoLibro = codigoLibro;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
