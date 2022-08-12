package org.chuz.sets;

import modelo.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploLIstSetComparable {


    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();

        //alumno debe implentar cla interfaz coparable un hasset no
        //compareto solo compara por un solo atributo  y no acepta primitivos
        sa.add(new Alumno("Chuz", 10));
        sa.add(new Alumno("Gabz",10));
        sa.add(new Alumno("Juan",8));
        sa.add(new Alumno("Pedro",7));
        //dos instancias doferentez con mismo valores
        //como impelntamso equal y hascode ya no poedemo tener distintos
        sa.add(new Alumno("Pedro2",7));

        System.out.println(sa);

        System.out.println("Iterando utilziando foreach");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando utiliando while y iterator");
        Iterator<Alumno> it = sa.iterator();

        while(it.hasNext()){
            Alumno  a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Utilizando expresiones Strea lambda con fearEach: ");
        sa.forEach(a-> System.out.println(a.getNombre()));

        //el set no se peude utilziar con un for clasico
        System.out.println("Utilziando un array classico");
        for (int i =0 ; i<sa.size(); i++){

            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }

    }
}
