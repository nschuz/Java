package org.chuz.sets;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {


        //no son rapidos a aocmparacion de los haset
        //ordena ocnforme la tabla unicode y no acepta elemntos repetids
        Set<String> ts = new TreeSet<>();

        ts.add("zorro");
        ts.add("Becerro");
        ts.add("Gaviota");
        ts.add("Elefante");
        ts.add("Aguila");
        ts.add("Vaca");
        ts.add("Vaca");


        System.out.println(ts);


        //podemos cambiar el orden

        Set<Integer> numeros = new TreeSet<>((a,b) ->{
                return  b.compareTo(a);
        });
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);
        numeros.add(5);

        System.out.println(numeros);





    }

}
