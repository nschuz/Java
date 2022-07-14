package org.chuz.pooclasesabractas.forms;

public class ImputForm extends ElementoForm {

    private String tipo ="text";


    public ImputForm(String nombre){
        super(nombre);
    }


    public ImputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //imoelentamos el metodo abstacto
    @Override
    public String dibujarHTml() {
        return "<input type=\"" + this.tipo +"\" " +
                "name=\""+this.nombre +"\" " +
                "valor = \""+this.valor +"\"> ";
    }
}
