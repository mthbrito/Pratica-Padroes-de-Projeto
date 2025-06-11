package org.example.PraticaPadroesEstruturais.decorator;

public class TextoSublinhado extends TextoDecorador {

    public TextoSublinhado(Texto texto) {
        super(texto);
    }

    @Override
    public String formata(String conteudo) {
        return "<u>" + super.formata(conteudo) + "</u>";    }
}
