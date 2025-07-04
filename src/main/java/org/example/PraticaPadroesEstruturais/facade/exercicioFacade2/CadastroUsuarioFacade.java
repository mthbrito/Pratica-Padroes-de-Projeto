package org.example.PraticaPadroesEstruturais.facade.exercicioFacade2;

public class CadastroUsuarioFacade {

    private ValidadorDados validadorDados = new ValidadorDados();
    private UsuarioService usuarioService = new UsuarioService();
    private EmailService emailService = new EmailService();
    private LogService logService = new LogService();

    public CadastroUsuarioFacade(ValidadorDados validadorDados, UsuarioService usuarioService, EmailService emailService, LogService logService) {
        this.validadorDados = validadorDados;
        this.usuarioService = usuarioService;
        this.emailService = emailService;
        this.logService = logService;
    }

    public void cadastrar(Usuario usuario){
        if (validadorDados.validar(usuario)) {
            if (!usuarioService.cpfExiste(usuario.getCpf())) {
                usuarioService.salvar(usuario);
                emailService.enviarBoasVindas(usuario.getEmail());
                logService.registrar("Usuário cadastrado: " + usuario.getNome());
            } else {
                logService.registrar("CPF já cadastrado.");
            }
        } else {
            logService.registrar("Dados inválidos.");
        }
    }
}
