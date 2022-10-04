package libreria.tienda;

import libreria.cliente.Clientes;
import libreria.libros.Libros;
import libreria.personal.Personal;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Tienda {
    //Tienda: nombre de la tienda, direccion, lista de clientes, lista de empleados, lista de libros
    private String nombreTienda;
    private String direccion;

    HashSet<Clientes> cliente=new HashSet<Clientes>();
    HashSet<Personal> empleados=new HashSet<Personal>();
    HashSet<Libros> libros=new HashSet<Libros>();

    public Tienda(String nombreTienda, String direccion) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Clientes> getCliente() {
        return cliente;
    }

    public void setCliente(HashSet<Clientes> cliente) {
        this.cliente = cliente;
    }

    public HashSet<Personal> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Personal> empleados) {
        this.empleados = empleados;
    }

    public HashSet<Libros> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libros> libros) {
        this.libros = libros;
    }
}
