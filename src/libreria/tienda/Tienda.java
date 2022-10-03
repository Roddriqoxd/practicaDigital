package libreria.tienda;

import java.lang.reflect.Array;

public class Tienda {
    //Tienda: nombre de la tienda, direccion, lista de clientes, lista de empleados, lista de libros
    private String nombreTienda;
    private String direccion;
    private Array listaCleintes;
    private Array listaEmpleados;
    private Array listaLibros;

    public Tienda(String nombreTienda, String direccion, Array listaCleintes, Array listaEmpleados, Array listaLibros) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.listaCleintes = listaCleintes;
        this.listaEmpleados = listaEmpleados;
        this.listaLibros = listaLibros;
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

    public Array getListaCleintes() {
        return listaCleintes;
    }

    public void setListaCleintes(Array listaCleintes) {
        this.listaCleintes = listaCleintes;
    }

    public Array getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Array listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Array getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Array listaLibros) {
        this.listaLibros = listaLibros;
    }
}
