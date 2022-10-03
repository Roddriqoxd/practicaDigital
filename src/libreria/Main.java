package libreria;

import libreria.cliente.Clientes;
import libreria.libros.Libros;
import libreria.personal.Personal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Personal de la libreria
        Personal personal1 = new Personal("juan","Perez","03/05/2022","JUA0503","promotor",5);
        Personal personal2 = new Personal("juan","Perez","03/05/2022","JUA0503","promotor",5);
        List<Personal> lista=Arrays.asList(personal1,personal2);
        //Clientes
        Clientes cliente1 =new Clientes("Pedro","Ramirez",515224,true,5,"03/05/2022","clienteAntiguo@dd.com");
        Clientes cliente2 =new Clientes("Pedro","Ramirez",515224,false,1,"03/05/2022","clienteNuevo@sas.com");
        List<Clientes> lista2=Arrays.asList(cliente1,cliente2);
        //Libros
        Libros libro1 =new Libros("El Principito","Es el personaje principal del libro. Vive en un pequeño planeta","Antoine de Saint-Exupéry","fantasia","Oceano",true,50,"pri001",10);
        Libros libro2 =new Libros("El Principito","Es el personaje principal del libro. Vive en un pequeño planeta","Antoine de Saint-Exupéry","fantasia","Oceano",false,50,"pri002",0);
        List<Libros> lista3=Arrays.asList(libro1,libro2);
        //Consultas

        //Empleados de la tienda
        System.out.println("Empleados de la tienda");
        for (Personal p:lista){
            System.out.println("Nombres: "+p.getNombres()+"Apellidos: "+p.getApellidos()+"Fecha contratacion: "+p.getFechaContratacion()+"Codigo: "+p.getCondigoEmpleado()+"Rol: "+p.getTipoEmpleado()+"Cantidad de ventas: "+p.getCantidadVentas());
        }

        //Clientes de la tienda
        System.out.println("Clientes de la tienda");
        for (Clientes p:lista2){
            System.out.println("Nombres: "+p.getNombre()+"Apellidos: "+p.getApellidos()+"CI: "+p.getCI()+"Antiguedad: "+p.getAntiguedad()+"Libros comprados: "+p.getLibrosComprados()+"Fecha de nacimiento: "+p.getFecha());
        }

        //Correo de clientes nuevos
        System.out.println("Correo de clientes nuevos");
        for (Clientes p:lista2){
            if(p.getAntiguedad()==false){
                System.out.println("Correo de clientes nuevos: " +p.getCorreo());
            }
        }

        //mostrar una lista de libros
        System.out.println("mostrar una lista de libros");
        for (Libros p:lista3){
            System.out.println("Titulo: "+p.getTitulo()+"Editorial: "+p.getEditorial()+"Autor: "+p.getAutor()+"Disponibilidad: "+p.isStatus());
        }

    }
}
