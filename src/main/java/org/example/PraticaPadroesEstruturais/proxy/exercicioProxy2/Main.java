package org.example.PraticaPadroesEstruturais.proxy.exercicioProxy2;


/* TODO:  ENVIO DE SMS
    A classe ServicoSms envia mensagens com código de verificação.
    A empresa decidiu que o número de envios dessas mensagens será limitado em 3 mensagens por dia.
    ...
    Aplique o padrão de Projeto Proxy neste contexto para controle de uso do serviço de mensagens, verificando o limite.

 */
public class Main {

    public static void main(String[] args) {
        ServicoSmsPadrao sms = new ServicoSmsPadrao();
        ServicoSmsProxy proxy = new ServicoSmsProxy(sms);

        proxy.envia("99999-9090", "Código de verificação: 123456");
        proxy.envia("99999-9090", "Código de verificação: 567890");
        proxy.envia("99999-9090", "Código de verificação: 789456");
        proxy.envia("99999-9090", "Código de verificação: 456987");
    }
}
