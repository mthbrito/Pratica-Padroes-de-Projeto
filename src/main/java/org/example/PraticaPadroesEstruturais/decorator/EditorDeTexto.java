package org.example.PraticaPadroesEstruturais.decorator;

public class EditorDeTexto {

    public static void main(String[] args) {

        String conteudo = "Padrões de projeto.";
        Texto texto = new TextoSimples(conteudo);
        texto = new TextoNegrito(texto);
        texto = new TextoSublinhado(texto);

        System.out.println(texto.formata(conteudo));
    }
}
