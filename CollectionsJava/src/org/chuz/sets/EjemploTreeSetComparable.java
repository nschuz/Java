package org.chuz.sets;

import modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {


    public static void main(String[] args) {

        Set<Alumno>  sa = new TreeSet<>();

        //alumno debe implentar cla interfaz coparable un hasset no
        //compareto solo compara por un solo atributo  y no acepta primitivos
        sa.add(new Alumno("Chuz", 10));
        sa.add(new Alumno("Gabz",10));
        sa.add(new Alumno("Juan",8));
        sa.add(new Alumno("Pedro",7));

        System.out.println(sa);




    }
}
