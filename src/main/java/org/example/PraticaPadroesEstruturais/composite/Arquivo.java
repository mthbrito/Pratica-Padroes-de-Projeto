package org.example.PraticaPadroesEstruturais.composite;

public class Arquivo implements Item {

    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void listar(){
        System.out.println("Abrindo arquivo: " + nome);
    }
}
