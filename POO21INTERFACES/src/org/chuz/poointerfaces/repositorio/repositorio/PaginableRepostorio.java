package org.chuz.poointerfaces.repositorio.repositorio;

import org.chuz.poointerfaces.repositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepostorio {

    List<Cliente> listar (int desde , int hasta);

}
