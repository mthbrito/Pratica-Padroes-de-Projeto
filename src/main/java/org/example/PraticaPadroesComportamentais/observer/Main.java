package org.example.PraticaPadroesComportamentais.observer;

// TODO 1: Sistema de notificações de estoque para uma loja virtual.
//  O estoque mantém uma lista de usuários e um notificador de emails e os notifica diretamente sempre que um novo produto é adicionado.
//  Apesar de funcionar, esse modelo torna o código altamente acoplado, pois o estoque lida diretamente com usuários e com a lista de emails.
//  .
//  Refatore o código aplicando o padrão Observer.

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Usuario maria = new Usuario("Maria", "maria@gmail.com");
        Usuario jose = new Usuario("José", "jose@hotmail.com");

        estoque.adicionarUsuario(maria);
        estoque.adicionarUsuario(jose);

        estoque.adicionarProduto(new Produto("Smartphone X", 25000));
    }
}