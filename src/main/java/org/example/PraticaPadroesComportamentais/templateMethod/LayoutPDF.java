package org.example.PraticaPadroesComportamentais.templateMethod;

public class LayoutPDF extends RelatorioTemplate{
    @Override
    protected void gerarLayout() {
        System.out.println("Gerando layout em PDF...");
    }
}
