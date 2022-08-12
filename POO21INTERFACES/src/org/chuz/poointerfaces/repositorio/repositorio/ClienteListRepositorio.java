package org.chuz.poointerfaces.repositorio.repositorio;

import org.chuz.poointerfaces.repositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio  implements CrudRepositorio, OrdenableRepositorio, PaginableRepostorio{


    private List<Cliente> dataScource;


    public ClienteListRepositorio(){
        this.dataScource = new ArrayList<>();
    }


    //como imeplemntamos crudrepositorio podemos impe,mnta las otras
    @Override
    public List<Cliente> listar() {
        return dataScource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;

        for (Cliente cliente : dataScource){
            if (cliente.getId().equals(id)){
                c = cliente;
                break;
            }
        }

        return c;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataScource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setApellido(cliente.getApellido());
        c.setNombre(cliente.getNombre());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataScource.remove(c);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {

        //pude ser un lase anonima o econ expresiones almbda
        dataScource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado =0;
                if (dir == Direccion.ASC){
                    switch (campo){
                        case "id" ->
                            resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido"->
                            resultado= a.getApellido().compareTo(b.getApellido());
                    }
                }else if (dir == Direccion.DESC){

                    switch (campo){
                        case "id" ->
                                resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                                resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido"->
                                resultado= b.getApellido().compareTo(a.getApellido());
                    }

                }

                return resultado;
            }
        });


        return dataScource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataScource.subList(desde, hasta);
    }
}
