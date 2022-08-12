package org.chuz.poointerfaces.repositorio.generics;

import org.chuz.poointerfaces.repositorio.modelo.Cliente;
import org.chuz.poointerfaces.repositorio.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGnericos {

    public static void main(String[] args) {

    /*
        List clientes = new ArrayList();
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente adres =(Cliente)clientes.iterator().next();
    */
        //LOS GENERICOS SIRVEN PARA QUE SEAN MAS LIMPIO Y REUTILIZABLE


        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente adres =clientes.iterator().next();

        Cliente [] clinetesArreglo = {
                new Cliente("Andres", "Guzman"),
                new Cliente("Andres", "Guzman")
        };

        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10};


        //observmso que es mas genrico nuestrs metodos
        List<Cliente>  clienteList = fromArrayToList(clinetesArreglo);
        List<Integer>  enterosList = fromArrayToList(enteros);


        clienteList.forEach(c -> System.out.println(c));

        List<String> nombres = fromArrayToList(new String[]{
                "Chuz", "Dani", "Jurian", "Karyme"
        },enteros);
        System.out.println(nombres);



        //implentacion al vuelo
        List<ClientePremium> clientesPremium = fromArrayToList(new ClientePremium[]{
            new ClientePremium("Chuz", "Rregis")
        });


        imprimirClientes(clientes);
        imprimirClientes(clienteList);

        //una clase hija  no e suna subclase de una lista de una clase padre
        imprimirClientes(clientesPremium);


        System.out.println("Maximo de 1,9y4:  "+maximo(1,9,4));
        System.out.println("Maximo de 3.9 , 11.6 , 7.78 es: "+maximo(3.9,11.6,31.2));
        System.out.println("Mazimo zanahahoria, arandonos, manzana "+maximo("zanahoria", "arandanos","manzana"));
    }

    public static List<Cliente> fromArrayClienteToList(Cliente[]  c){
        return Arrays.asList(c);
    }

    //Este arreglo es mas generico
    public static <T> List<T> fromArrayToList(T[]  c){
        return Arrays.asList(c);
    }

    //limitamos que solo  funcione con Number
    public static <T extends Number > List<T> fromArrayToList(T[]  c){
        return Arrays.asList(c);
    }



    //este recibe cualquier ckase de cliente y subcalse tambien le dceimos que implente la interafcez comparable
    public static <T extends Cliente & Comparable<T> > List<T> fromArrayToList(T[]  c){
        return Arrays.asList(c);
    }

    //este metodo recibe dso tipos genericos
    public static <T,G> List<T> fromArrayToList(T[]  c, G[] g){
        for (G elemnto: g){
            System.out.println(elemnto);
        }

        return Arrays.asList(c);
    }



    //ya con esto recibe elemntos de la clases hijas
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }


    public static <T extends  Comparable<T>> T maximo(T a , T b, T c){
        T max = a;
        if (b.compareTo(max)>0){
            max=b;
        }

        if (c.compareTo(max)>0){
            max=c;
        }

        return max;
    }

}
