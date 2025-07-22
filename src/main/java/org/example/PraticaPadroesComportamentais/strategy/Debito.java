package org.example.PraticaPadroesComportamentais.strategy;

public class Debito implements PagamentoStrategy{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via cartão de débito.");
    }
}
