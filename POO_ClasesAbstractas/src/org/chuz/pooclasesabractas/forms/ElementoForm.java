package org.chuz.pooclasesabractas.forms;

import org.chuz.pooclasesabractas.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    //una clase abstarcta oude tener metods normale sin abstarcta
    //pero si un metodo es abstarct estamos obligado que la clase se abstacta

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;


    public ElementoForm(){
        //incializamos nuestor arreglo
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getErrores(){
        return this.errores;
    }


    public ElementoForm addValidador (Validador validador){
        this.validadores.add(validador);
        return this;
    }



    public boolean esValido (){
        for (Validador v : validadores){
            if(!v.esValido(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        //no tiene errores true .size()==0
        return this.errores.isEmpty();
    }


    //no puede tene un body {}
    abstract public String dibujarHTml();


}
