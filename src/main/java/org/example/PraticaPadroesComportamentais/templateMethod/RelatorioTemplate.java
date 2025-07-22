package org.example.PraticaPadroesComportamentais.templateMethod;

public abstract class RelatorioTemplate {

    public void gerar() {
        abrirConexaoBanco();
        buscarDados();
        gerarLayout();
        fecharConexao();
    }

    private void abrirConexaoBanco() {
        System.out.println("Abrindo conexão com banco...");
    }

    private void buscarDados() {
        System.out.println("Buscando dados...");
    }

    protected abstract void gerarLayout();

    private void fecharConexao() {
        System.out.println("Fechando conexão...");
    }
}
