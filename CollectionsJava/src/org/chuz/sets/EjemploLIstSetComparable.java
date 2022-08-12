package org.chuz.sets;

import modelo.Alumno;

import java.util.*;

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

        //en las listas se ordenan como van entrando
        //si llamos este se aplica el ordenamiento que esta en la claseALumno (CompareTo)
        //pero pdemos utilziar un compartor
        //Collections.sort(sa);

        //sa.sort((a,b)-> a.compareTo(b));

        //otra froma en java 8 Aluno el tipo y porque ordenamos
        sa.sort(Comparator.comparing((Alumno a)-> a.getNota()).reversed());


        //si quiero sobreescribir ese compartimeot necesito comparaot


        System.out.println("Utilizando expresiones Strea lambda con fearEach: ");
        sa.forEach(a-> System.out.println(a.getNombre()));


    }
}
