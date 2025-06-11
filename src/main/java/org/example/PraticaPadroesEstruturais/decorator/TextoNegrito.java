package org.example.PraticaPadroesEstruturais.decorator;

public class TextoNegrito extends TextoDecorador {

    public TextoNegrito(Texto texto) {
        super(texto);
    }

    @Override
    public String formata(String conteudo) {
        return "<b>" + super.formata(conteudo) + "</b>";    }
}
