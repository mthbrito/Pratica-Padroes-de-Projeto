package org.example.PraticaPadroesComportamentais.observer;

public class Usuario implements Observer {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificaAlteracao(Produto produto) {
        System.out.println("Notificação para " + nome + ": Novo produto disponível - " + produto.getNome());
    }

}
