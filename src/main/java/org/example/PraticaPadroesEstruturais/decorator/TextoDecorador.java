package org.example.PraticaPadroesEstruturais.decorator;

public abstract class TextoDecorador implements Texto {

    private final Texto texto;

    public TextoDecorador(Texto texto) {
        this.texto = texto;
    }

    @Override
    public String formata(String conteudo) {
        return texto.formata(conteudo);
    }
}
