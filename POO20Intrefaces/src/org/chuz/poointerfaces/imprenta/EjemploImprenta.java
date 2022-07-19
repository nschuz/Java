package org.chuz.poointerfaces.imprenta;

import org.chuz.poointerfaces.imprenta.modelo.*;
import static org.chuz.poointerfaces.imprenta.modelo.Genero.PROGRAMACION;

public class EjemploImprenta {
    public static void main(String[] args) {


        Curriculum cv = new Curriculum(new Persona("John", "Doe"), "Ingeniero en sistemas", "Resumen Laboral");
        cv.addExprecienci("Java");
        cv.addExprecienci("Oracle DBA");
        cv.addExprecienci("Spring Framework");

        Informe informe = new Informe(new Persona("James", "Gossgling"), "Martin Fowler", "Estudio de sobre microservivioc");


        Libro libro = new Libro(new Persona("Eric", "Gamma"), "Patrones de diseños ",
                PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Obseravador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Imprimible.imprimir(libro);
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return Imprimible.super.imprimir();
            }
        });

    }

    /*
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }

     */
   /*
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

*/

    //que pasasi quiero imprimir cosas que no son hoja ejemplo libro , revisa
    //como no hay una relacion de parestenco utilizamos interfaces


}
