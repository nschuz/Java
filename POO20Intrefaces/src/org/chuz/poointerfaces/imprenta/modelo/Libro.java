package org.chuz.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    //private List<Hoja> paginas;
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas= new ArrayList<>();
    }


    public Libro addPagina (Imprimible pagina){
        paginas.add(pagina);
        return this;

    }


    //este no sobreescibe bueno con implents si
    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Gnero: ").append(this.genero).append("\n");

        for (Imprimible pagina : this.paginas){
            sb.append(pagina.imprimir()).append("\n");
        }
        return  sb.toString();
    }


}
