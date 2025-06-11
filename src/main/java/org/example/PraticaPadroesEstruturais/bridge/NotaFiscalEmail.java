package org.example.PraticaPadroesEstruturais.bridge;

public class NotaFiscalEmail implements EnvioNotaFiscal {
    @Override
    public void emitir(String cliente, double valor) {
        System.out.println("Emitindo nota fiscal para " + cliente + ", valor: R$" + valor);
        System.out.println("Enviando por EMAIL...");
    }
}
