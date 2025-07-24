package org.example.PraticaPadroesComportamentais.strategy;

public class Credito implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via cartão de crédito.");
    }
}
