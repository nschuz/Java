package org.chuz.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;


public class Curriculum extends Hoja implements Imprimible{


    private Persona persona;
    //podria de una clase Carrea y tambien persona
    private String carrera;
    List<String> experiencias;




    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera=carrera;
        //inicalizmaos el arreylist
        this.experiencias = new ArrayList<>();
    }


    //lo hacemso encadenado
    public Curriculum addExprecienci (String ex){
        experiencias.add(ex);
        return this;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experciecias: \n");

        for (String experiencia : experiencias){
            sb.append("- ").append(experiencia).append("\n");
        }

        return sb.toString();
    }
}
