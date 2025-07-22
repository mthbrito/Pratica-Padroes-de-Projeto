package org.example.PraticaPadroesComportamentais.observer;

public class Usuario implements EstoqueObserver{

    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public void notificaAlteracao(Produto produto) {
        System.out.println("E-mail enviado para " + email + ": Novo produto disponível - " + produto.getNome());
    }
}
