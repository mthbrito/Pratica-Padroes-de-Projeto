package org.example.PraticaPadroesComportamentais.observer;

public class NotificadorEmail implements Observer{

    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void notificaAlteracao(Produto produto) {
        System.out.println("E-mail enviado para " + email + ": Novo produto disponível - " + produto.getNome());
    }
}
