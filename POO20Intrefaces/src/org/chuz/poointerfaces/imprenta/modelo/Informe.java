package org.chuz.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private Persona autor;

    //podria hace de tipo Persona
    private String revisor;





    public Informe(Persona autor, String revisor, String contenido) {
        super(contenido);
        this.autor=autor;
        this.revisor=revisor;
    }

    @Override
    public String imprimir() {
        return "Infrome escrito por: "+ autor+
                "Revisado por: " + revisor +
                "\n" + this.contenido;
    }
}
