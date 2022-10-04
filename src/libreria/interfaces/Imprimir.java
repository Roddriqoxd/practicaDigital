package libreria.interfaces;

import libreria.personal.Personal;

public class Imprimir {
    private Imprimable ob;


    public Imprimir(Imprimable imprimir) {
        this.ob = imprimir;
    }

    public void imprimirObjeto(){
        System.out.println(this.ob.imprimir());

    }
}
