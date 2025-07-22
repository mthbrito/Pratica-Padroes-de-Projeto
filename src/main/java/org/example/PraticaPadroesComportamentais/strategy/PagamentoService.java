package org.example.PraticaPadroesComportamentais.strategy;

public class PagamentoService {

    private PagamentoStrategy metodo;
    private double valor;

    public PagamentoService(PagamentoStrategy metodo) {
        this.metodo = metodo;
    }

    public void setMetodo(PagamentoStrategy metodo) {
        this.metodo = metodo;
    }

    public void pagar(double valor) {
        metodo.pagar(valor);
    }
}

