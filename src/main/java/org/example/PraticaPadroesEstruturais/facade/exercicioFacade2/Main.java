package org.example.PraticaPadroesEstruturais.facade.exercicioFacade2;

/* TODO: SISTEMA DE CADASTRO DE USUÁRIO:
    O sistema executa várias etapas para que o usuário possa ser cadastrado:
    1 - Valida os dados pessoais do usuário;
    2 - Verifica se o CPF já consta na base de dados;
    3 - Salva os dados no banco;
    4 - Envia e-mail de boas vindas ao usuário;
    5 - Registra o log da operação;
    ...
    ...
    Aplique o padrão de Projeto Facade neste contexto.

 */
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Maria", "11111111111", "maria@email.com");
        Usuario usuario2 = new Usuario("José", "22222222222", "jose@gmail.com");

        ValidadorDados validadorDados = new ValidadorDados();
        UsuarioService usuarioService = new UsuarioService();
        EmailService emailService = new EmailService();
        LogService logService = new LogService();

        CadastroUsuarioFacade facade = new CadastroUsuarioFacade(validadorDados, usuarioService, emailService, logService);
        facade.cadastrar(usuario1);
        System.out.println(" ");
        facade.cadastrar(usuario2);
    }
}