package org.example.PraticaPadroesEstruturais.decorator;

public class TextoSimples implements Texto {

    private final String conteudo;

    public TextoSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String formata(String conteudo) {
        return conteudo;
    }
}
