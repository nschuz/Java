package org.chuz.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado2 {
    public static void main(String[] args) {


        String [] peces = {
                "Corvina", "Lenguado","Robalo", "Atrun", "Lenguado"
        };

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();


        for (String pez: peces){
            if (!unicos.add(pez)){
                System.out.println("Elemnto duplicado : "+pez);
                duplicados.add(pez);
            }
        }

        unicos.removeAll(duplicados);
        System.out.println(unicos.size()+ "  "+ unicos);
        System.out.println(duplicados);

    }
}
