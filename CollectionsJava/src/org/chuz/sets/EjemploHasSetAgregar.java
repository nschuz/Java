package org.chuz.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHasSetAgregar {

    public static void main(String[] args) {


        Set<String> hs = new HashSet<>();


        hs.add("HOLA");
        hs.add("UNO");
        hs.add("DOS");
        hs.add("TRES");
        hs.add("CUATRO");
        hs.add("CINCO");

        //regersa  add boolean si lo agrego
        boolean is_added = hs.add("HOLA");
        System.out.println(is_added);
        System.out.println(hs);


        //|Collections.sort(hs);
        System.out.println(hs);


    }
}
