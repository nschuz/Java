package org.chuz.poointerfaces.repositorio;

import org.chuz.poointerfaces.repositorio.modelo.Cliente;
import org.chuz.poointerfaces.repositorio.repositorio.*;

import java.util.List;

public class EjemploRepositorio {


    public static void main(String[] args) {


        //impelntaciocon ocmo DAO
        // el timpo mas genrico  = l aimplentacion es la implemntacion concrtea
        CrudRepositorio repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Chuz", "Regis"));
        repo.crear(new Cliente("Gabz", "Regsi"));


        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);


        /* }
            Hola Jose, si hacemos el cast a un tipo concreto para poder llamar sus metodos en especifico que no estan en la interface, entonces se crea un objeto con el new de una clase concreta que implementa una interfaz, pero al ser del tipo de esa interfaz le asociamos el tipo mas genérico de esa interface, pero para invocar los métodos concretos de la clase hacemos el cast, saludos

         */
        System.out.println("***************");
        List<Cliente> paginable = ((PaginableRepostorio)repo).listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("======= ORDENAR ========");
        //si juntamos todas las intrfaces en una sola ya noe snecsario hacer el cast
        //n la interfaces pues utilizar el extends varias veces
        List<Cliente> clienteOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);

        for (Cliente cliente : clienteOrdenAsc){
            System.out.println(cliente);
        }


        /*
        System.out.println("====EDITAR=====");
        Cliente beaActualiza = new Cliente("Bea", "Mena");
        beaActualiza.setId(2);
        repo.editar(beaActualiza);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        */







    }




}
