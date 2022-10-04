package libreria;

import libreria.cliente.Clientes;
import libreria.interfaces.Imprimir;
import libreria.libros.Libros;
import libreria.personal.Personal;
import libreria.tienda.Tienda;
import libreria.ventas.Ventas;

import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static libreria.libros.Libros.Generos.FANTASIA;
import static libreria.libros.Libros.Generos.TERROR;
import static libreria.personal.Personal.Rol.PROMOTOR;
import static libreria.personal.Personal.Rol.CAJERO;

public class Main {
    public static void main(String[] args) {
        //Personal de la libreria
        Personal personal1 = new Personal("Juan","Perez","03/05/2022","JUA0503", PROMOTOR,12);
        Personal personal2 = new Personal("Juanito","Quispe","22/01/2022","JUA0122",CAJERO,null);
        List<Personal> lista=Arrays.asList(personal1,personal2);
        //Clientes
        Clientes cliente1 =new Clientes("Pedro","Ramirez",515224,true,5,"03/05/2022",null);
        Clientes cliente2 =new Clientes("Sebastian","Lopez",588745,false,1,"03/08/2022","clienteAntiguo@dd.com");
        List<Clientes> lista2=Arrays.asList(cliente1,cliente2);
        //Libros
        Libros libro1 =new Libros("El Principito","Es el personaje principal del libro. Vive en un pequeño planeta","Antoine de Saint-Exupéry",FANTASIA,"Oceano",true,50,"pri001",10);
        Libros libro2 =new Libros("Harry Potter","El personaje es un hechicero","J. K. Rowling",TERROR,"Oceano",false,100,"pri002",0);
        List<Libros> lista3=Arrays.asList(libro1,libro2);
        //Tienda
        Tienda tienda=new Tienda("Libreria Vanguardia","Calle Demetrio Perez N°365");
        //Ventas

        //Consultas
        //Empleados de la tienda
        System.out.println("Empleados de la tienda");
        for (Personal p:lista){
            Imprimir imprimir=new Imprimir(p);
            imprimir.imprimirObjeto();
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //Clientes de la tienda antiguos
        System.out.println("Clientes antiguos de la tienda");
        for (Clientes p:lista2){
            if (p.getAntiguedad()==true){
                Imprimir imprimir=new Imprimir(p);
                imprimir.imprimirObjeto();
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //Correo de clientes nuevos
        System.out.println("Correo de clientes nuevos");
        for (Clientes p:lista2){
            if(p.getAntiguedad()==false){
                if (p.getCorreo()!= null){
                System.out.println(p.getNombre()+" ->correo: "+p.getCorreo());
                }
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //mostrar una lista de libros
        System.out.println("mostrar una lista de libros");
        for (Libros p:lista3){
            Imprimir imprimir=new Imprimir(p);
            imprimir.imprimirObjeto();
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //Avisasr si el libro esta disponible
        System.out.println(cliente1.getNombre() +" quiere comprar el libro: "+ libro1.getTitulo());
        if (libro1.isStatus()==false){
            System.out.println("El libro no esta disponible");
        }else{
            System.out.println("El libro esta disponible");
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //Mostrar si es cumpleaños del cliente
        System.out.println("Mostrar si es cumpleaños del cliente");
        for (Clientes p:lista2){
            String today= "03/05/2022";
            String subtoday =today.substring(0,5);
            String subCliente = p.getFecha().substring(0,5);
            if(subtoday.equals(subCliente)){
                System.out.println("Es cunpleaños del cliente, aplicar descuento de 5%!");

            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //Gerente con mayor venta
        System.out.println("Promotores de ventas");
        for (Personal p:lista){
            if (p.getTipoEmpleado() == PROMOTOR){
                System.out.println(p.getNombres()+" "+p.getFechaContratacion()+" "+p.getCantidadVentas());
                if (p.getCantidadVentas()>0){
                    System.out.println("Se sumo 5% de comision de los libros vendidos");
                }
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //El gerente quiere listar libros dado un genero X.
        System.out.println("Mostrar genero: " + FANTASIA);
        for (Libros p:lista3){
            if (p.getGenero().equals(FANTASIA)){
                System.out.println(p.getTitulo());
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        //
    }
}
