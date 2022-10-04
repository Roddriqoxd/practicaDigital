package libreria.ventas;

import java.util.Date;

public class Ventas {
    //cliente que hizo la compra, libro comprado, promotor que ayudo en su compra (dato opcional),
    // cajero que lo atendio, precio de original venta, porcentaje de descuento (por cumpleaños de cliente,
    // pero, que deba ser cliente antiguo, descuento por 10%), precio con descuento de venta, fecha de venta,
    // codigo de venta (codigo alfanumerico compuesto por 3 letras mayusculas (excluyendo las letra Ñ)
    // mas 2 numeros, por ejemplo: ORA54).
    private String cliente;
    private String libroComprado;
    //private String promotor;
    private String cajero;
    private double precioOriginal;
    private double procentajeDescuento; //solo cliente antiguo
    private double precioDescuento;
    private String fechaVenta;
    private String codigoVenta; //sin la letra ñ --> example: ORA54

    public Ventas(String cliente, String libroComprado, String cajero, double precioOriginal, double procentajeDescuento, double precioDescuento, String fechaVenta, String codigoVenta) {
        this.cliente = cliente;
        this.libroComprado = libroComprado;
        this.cajero = cajero;
        this.precioOriginal = precioOriginal;
        this.procentajeDescuento = procentajeDescuento;
        this.precioDescuento = precioDescuento;
        this.fechaVenta = fechaVenta;
        this.codigoVenta = codigoVenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLibroComprado() {
        return libroComprado;
    }

    public void setLibroComprado(String libroComprado) {
        this.libroComprado = libroComprado;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public double getPrecioOriginal() {
        return precioOriginal;
    }

    public void setPrecioOriginal(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public double getProcentajeDescuento() {
        return procentajeDescuento;
    }

    public void setProcentajeDescuento(double procentajeDescuento) {
        this.procentajeDescuento = procentajeDescuento;
    }

    public double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(double precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
}
