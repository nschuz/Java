package org.chuz.pooclasesabractas.forms.elementos;

public class Opcion {


    private String valor;
    private String nombre;
    private boolean selected;


    public Opcion (){

    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Opcion isSelected(boolean valor) {
        this.selected=valor;
        return this;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
