package org.example.PraticaPadroesComportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements Subject{

    private List<Observer> observadores = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notificaObserver(Produto produto) {
        for(Observer observador: observadores) {
            observador.notificaAlteracao(produto);
        }
    }

    public void adicionarProduto(Produto produto) {
        System.out.println("Produto adicionado ao estoque: " + produto.getNome());
        notificaObserver(produto);
    }





}
