package libreria.personal;

import libreria.interfaces.Imprimable;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Personal implements Imprimable {
    private String nombres;
    private String apellidos;
    private String fechaContratacion;
    private String condigoEmpleado; //ejemplo: nombre: juan ingreso el 24 de mayo, su codigo es: JUA0524
    private Rol tipoEmpleado; //cajero, promotor de venta, gerente de la tienda
    private Integer cantidadVentas; //solo rol promotor
    public Personal(String nombres, String apellidos, String fechaContratacion, String condigoEmpleado,
                    Rol tipoEmpleado ,Integer cantidadVentas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaContratacion = fechaContratacion;
        this.condigoEmpleado = condigoEmpleado;
        this.tipoEmpleado = tipoEmpleado;
        this.cantidadVentas = cantidadVentas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaContratacion() {

        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {

        this.fechaContratacion = fechaContratacion;
    }

    public String getCondigoEmpleado() {
        return condigoEmpleado;
    }

    public void setCondigoEmpleado(String condigoEmpleado) {
        this.condigoEmpleado = condigoEmpleado;
    }

    public Rol getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(Rol tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Integer getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(Integer cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
    public enum Rol{
        CAJERO,
        PROMOTOR,
        GERENTE
}

    @Override
    public String imprimir() {
        return this.nombres+ "  "+ this.apellidos+ "  "+ this.fechaContratacion+ "  "+
                this.condigoEmpleado+ "  "+ this.tipoEmpleado +" "+this.cantidadVentas;
    }
}
