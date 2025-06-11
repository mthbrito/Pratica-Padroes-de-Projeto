package org.example.PraticaPadroesEstruturais.decorator;

public class TextoItalico extends TextoDecorador {

    public TextoItalico(Texto texto) {
        super(texto);
    }

    @Override
    public String formata(String conteudo) {
        return "<i>" + super.formata(conteudo) + "</i>";
    }
}
