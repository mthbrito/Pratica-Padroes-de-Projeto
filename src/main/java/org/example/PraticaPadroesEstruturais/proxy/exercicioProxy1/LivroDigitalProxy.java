package org.example.PraticaPadroesEstruturais.proxy.exercicioProxy1;

public class LivroDigitalProxy implements LivroDigital {

    private LivroDigital livroDigital;
    private String plano;

    public LivroDigitalProxy(LivroDigital livroDigital, String plano) {
        this.livroDigital = livroDigital;
        this.plano = plano;
    }

    @Override
    public void ler() {
        if (plano.equalsIgnoreCase("Comum")) {
            System.out.println(livroDigital.getTitulo());
            System.out.println("Assine o plano Premium para acessar o conteúdo completo.");
        } else if (plano.equalsIgnoreCase("Premium")) {
            livroDigital.ler();
        } else {
            System.out.println("Você ainda não tem plano, assine agora e acesse o conteúdo!");
        }
    }

    @Override
    public String getTitulo() {
        return livroDigital.getTitulo();
    }
}
