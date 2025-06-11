package org.example.PraticaPadroesCriacionais.singleton.usuarioAtivo;


public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = Usuario.getInstancia("Thallyta");
        Usuario usuario2 = Usuario.getInstancia("Maria");

        usuario1.exibirInformacoes();
        usuario2.exibirInformacoes();

        System.out.println("Instância única? " + (usuario1 == usuario2));
    }
}