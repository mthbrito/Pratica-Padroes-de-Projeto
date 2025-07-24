package org.example.PraticaPadroesComportamentais.strategy;

public class PagamentoService {

    private PagamentoStrategy metodo;

    public PagamentoService() {
    }

    public PagamentoService(PagamentoStrategy metodo) {
        this.metodo = metodo;
    }

    public void setMetodo(PagamentoStrategy metodo) {
        this.metodo = metodo;
    }

    public void pagar(double valor) {
        if (metodo != null)
            metodo.pagar(valor);
        else
            System.out.println("Nenhuma estratégia de pagamento foi definida.");
    }
}

