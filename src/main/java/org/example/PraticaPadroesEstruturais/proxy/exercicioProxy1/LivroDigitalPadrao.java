package org.example.PraticaPadroesEstruturais.proxy.exercicioProxy1;

public class LivroDigitalPadrao implements LivroDigital {

    private String titulo;
    private String conteudo;

    public LivroDigitalPadrao(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void ler() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

}
