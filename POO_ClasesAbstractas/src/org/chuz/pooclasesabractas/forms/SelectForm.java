package org.chuz.pooclasesabractas.forms;

import org.chuz.pooclasesabractas.forms.elementos.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    //list de apicollection de java
    //list es una interaz es decir un tipo bien genric
    private List<Opcion> opciones ;


    public SelectForm(String nombre) {
        super(nombre);
        //ArayList es la clase ya no la interfaz
        //cuando de inicializa si es el interfaz
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }


    //metodo de froma encadena
    public  SelectForm  addOpcion (Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHTml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='");
        sb.append(this.nombre);
        sb.append("'>");



        for (Opcion opcion: this.opciones ){
            sb.append("\n<option value='");
            sb.append(opcion.getValor());



            sb.append("'>");
            sb.append(opcion.getNombre());
            sb.append("</option>");
        }
        sb.append("</selected>");

        return sb.toString();

    }
}
