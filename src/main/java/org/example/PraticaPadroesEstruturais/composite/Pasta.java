package org.example.PraticaPadroesEstruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Item {

    private final String nome;
    private final List<Item> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

    @Override
    public void listar() {
        System.out.println("Listando itens: " + nome);
        for (Item item : itens) {
            item.listar();
        }
    }
}
