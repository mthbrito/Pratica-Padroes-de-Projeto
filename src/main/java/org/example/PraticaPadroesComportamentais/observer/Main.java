package org.example.PraticaPadroesComportamentais.observer;

// TODO 1: Sistema de notificações de estoque para uma loja virtual.
//  O estoque mantém uma lista de usuários e um notificador de emails e os notifica diretamente sempre que um novo produto é adicionado.
//  Apesar de funcionar, esse modelo torna o código altamente acoplado, pois o estoque lida diretamente com usuários e com a lista de emails.
//  .
//  Refatore o código aplicando o padrão Observer.

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Observer maria = new Usuario("Maria");
        Observer jose = new Usuario("José");
        Observer email = new NotificadorEmail("joaquim@gmail.com");

        estoque.addObserver(maria);
        estoque.addObserver(jose);
        estoque.addObserver(email);

        estoque.adicionarProduto(new Produto("Smartphone X", 2500));
    }
}