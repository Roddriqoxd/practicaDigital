package libreria.personal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Personal {
    //Personal: nombres apellidos, fecha de contratacion, codigo de empledo
    // (compuesto por las 3 primeras letras de su apellido mas el mes y el dia de contratacion,
    // por ejemplo: nombre: juan ingreso el 24 de mayo, su codigo es: JUA0524), tipo de empleado
    // (donde puede ser: cajero, promotor de venta, gerente de la tienda), cantidad de libros vendidos
    // (solo aplica a promotores de venta).
    private String nombres;
    private String apellidos;
    private String fechaContratacion;
    private String condigoEmpleado; //ejemplo: nombre: juan ingreso el 24 de mayo, su codigo es: JUA0524
    private String tipoEmpleado; //cajero, promotor de venta, gerente de la tienda
    private int cantidadVentas; //solo rol promotor

    public Personal(String nombres, String apellidos, String fechaContratacion, String condigoEmpleado, String tipoEmpleado, int cantidadVentas) {
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

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
}
