package org.chuz.poointerfaces.repositorio.repositorio;

import org.chuz.poointerfaces.repositorio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    //peude tener sobrecarga de metosdos
    List<Cliente> listar(String campo , Direccion dir);

}
