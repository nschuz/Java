package map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String , String> persona = new HashMap<>();
        //Haspm utiliza le metodo hascodde y depues el equals
        //la llaves son unica

        persona.put("nombre", "Chuz");
        persona.put("apellido", "Doe");
        persona.put("email", "chuz@gmail.com");
        persona.put("edad", "30");
        persona.put(null, "30");


        System.out.println("Persona: "+persona);

        //remove
      String apellido=  persona.remove("apellido");
      System.out.println(apellido);

      //constains key
        System.out.println(persona.containsKey("apellido"));

      //constains  values
        System.out.println(persona.containsKey("30"));


        //Colelction  no es ordenable no tiene un orden
        //values retronar uan coleccion de tipo string
        Collection<String> valores = persona.values();

        for(String v : valores){
            System.out.println(v);
        }


        Set<String> llaves = persona.keySet();
        for(String key :llaves){
            System.out.println(key);
        }


        //iterando en conjunti
        //Entry es una clase inner ()que es embebia dentro de maa
        for (Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey()+ " => "+ par.getValue());
        }


        //otra forma
        for(String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => "+valor);
        }

      //java 8 forEach
      persona.forEach((llave, valor) -> {
          System.out.println(llave + " => "+valor);
      });


        System.out.println("Total: "+persona.size());
        System.out.println("Contiene elementos= "+ !persona.isEmpty());
        persona.replace("edad", "30");
        System.out.println("persona= "+persona);


    }
}
