package org.example.PraticaPadroesComportamentais.observer;

public class Produto {

    private String nome;
    private double valorUnitario;

    public Produto(String nome, double valorUnitario) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
