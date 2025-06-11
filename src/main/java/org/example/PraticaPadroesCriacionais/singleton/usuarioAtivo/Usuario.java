package org.example.PraticaPadroesCriacionais.singleton.usuarioAtivo;

//TODO: Problema - O sistema age como se os dois usuários estivessem logados ao mesmo tempo,
// o que não faz sentido num contexto de usuário único ativo.


public class Usuario {


    private static Usuario instancia;
    private String nome;

    private Usuario(String nome) {
        this.nome = nome;
    }

    public static Usuario getInstancia(String nome) {
        if (Usuario.instancia == null) {
            Usuario.instancia = new Usuario(nome);
        }
        return Usuario.instancia;
    }

    public void exibirInformacoes() {
        System.out.println("Usuário logado: " + nome);
    }
}
