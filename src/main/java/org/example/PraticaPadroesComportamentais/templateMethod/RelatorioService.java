package org.example.PraticaPadroesComportamentais.templateMethod;

public class RelatorioService {

    public void gerarRelatorioPDF() {
        new LayoutPDF().gerar();
    }

    public void gerarRelatorioHTML() {
        new LayoutHTML().gerar();
    }

    public void gerarRelatorioCSV() {
        new LayoutCSV().gerar();
    }

    public void gerarRelatorioJSON() {
        new LayoutJSON().gerar();
    }

}
