package org.chuz.sets;

import modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class MetodosArrayList {

    public static void main(String[] args) {


        List<Alumno> sa = new ArrayList<>();


        sa.add(new Alumno("Chuz", 10));
        sa.add(new Alumno("Gabz",10));
        sa.add(new Alumno("Juan",8));
        sa.add(new Alumno("Pedro",7));
        //agrega la psocion 1 (no lo agrega)
        sa.add(1,new Alumno("Pedro2",7));

        //no agrega actualiza en la psicion 1
        sa.set(1, new Alumno("Jurian",9));

        //size
        System.out.println("Tamaño:  "+sa.size());

        //is empty
        System.out.println("Esta vacia: "+sa.isEmpty());


        //remuve mediante el equals (urilzia equals)
        sa.remove( new Alumno("Jurian",9));
        System.out.println(sa);

        boolean b = sa.contains(new Alumno("Jurian",9));
        System.out.println("Esta en la lista: "+b);


        //lo pasamos a un arreglo nomral
        Object a[] = sa.toArray();

        String [] arreglo  = new String[5];
        String [] arreglito = {"HOLI"};

        for(int i=0; i<a.length ; i++){
            System.out.println("Desde el arreglo: ="+a[i]);
        }






    }
}
