package org.chuz.pooclasesabractas.forms;

abstract public class ElementoForm {

    //una clase abstarcta oude tener metods normale sin abstarcta
    //pero si un metodo es abstarct estamos obligado que la clase se abstacta

    protected String valor;
    protected String nombre;

    public ElementoForm(){

    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    //no puede tene un body {}
    abstract public String dibujarHTml();


}
