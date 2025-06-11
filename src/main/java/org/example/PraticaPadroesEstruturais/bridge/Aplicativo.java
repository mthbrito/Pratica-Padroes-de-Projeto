package org.example.PraticaPadroesEstruturais.bridge;

public class Aplicativo {

    public static void main(String[] args) {

        EnvioNotaFiscal porEmail = new NotaFiscalEmail();
        EnvioNotaFiscal impresso = new NotaFiscalImpressora();

        NotaFiscal notaFiscalEmail = new NotaFiscal("Maria José", 1200.00, porEmail);
        NotaFiscal notaFiscalImpressora = new NotaFiscal("João José", 942.00, impresso);

        notaFiscalEmail.emitir();
        notaFiscalImpressora.emitir();
    }
}
