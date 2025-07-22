package org.example.PraticaPadroesComportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Usuario> usuarios = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public Estoque() {
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarProduto(Produto produto) {
        System.out.println("Produto adicionado ao estoque: " + produto.getNome());
        notificaUsuarios(produto);
    }

    private void notificaUsuarios(Produto produto) {
        for(Usuario usuario: usuarios) {
            usuario.notificaAlteracao(produto);
        }
    }
}
