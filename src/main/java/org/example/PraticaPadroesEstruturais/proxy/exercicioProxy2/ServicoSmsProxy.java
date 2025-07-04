package org.example.PraticaPadroesEstruturais.proxy.exercicioProxy2;

public class ServicoSmsProxy implements  ServicoSms {

    private ServicoSms servicoSms;
    private int limite;

    public ServicoSmsProxy(ServicoSms servicoSms) {
        this.servicoSms = servicoSms;
        this.limite = 0;
    }

    @Override
    public void envia(String numero, String mensagem) {
        if(limite < 3) {
            servicoSms.envia(numero, mensagem);
            limite++;
        } else {
            System.out.println("Limite de mensagens excedido por hoje!");
        }
    }
}
