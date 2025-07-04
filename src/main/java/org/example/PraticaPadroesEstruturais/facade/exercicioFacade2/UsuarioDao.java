package org.example.PraticaPadroesEstruturais.facade.exercicioFacade2;

import java.util.List;

public interface UsuarioDao {

    void adiciona(Usuario usuario);
    Usuario buscaPorCpf(String cpf);
    List<Usuario> listaTodos();
    boolean removePorCPf(String cpf);

}
