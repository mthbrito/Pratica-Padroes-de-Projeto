package org.example.PraticaPadroesEstruturais.proxy.exercicioProxy2;

public class ServicoSmsPadrao implements ServicoSms {

    @Override
    public void envia(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
}
