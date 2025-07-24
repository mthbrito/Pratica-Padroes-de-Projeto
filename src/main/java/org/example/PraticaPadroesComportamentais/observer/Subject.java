package org.example.PraticaPadroesComportamentais.observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notificaObserver(Produto produto);
}
