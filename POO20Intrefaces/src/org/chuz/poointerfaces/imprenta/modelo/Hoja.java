package org.chuz.poointerfaces.imprenta.modelo;

abstract public class Hoja {

    //algo que las clases tengan en comun
    protected String contenido;

    //constructor
    public Hoja(String contenido){
        this.contenido=contenido;
    }


    //metodos
    abstract  public String imprimir();

}
