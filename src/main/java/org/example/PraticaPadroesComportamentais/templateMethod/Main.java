package org.example.PraticaPadroesComportamentais.templateMethod;

// TODO 3: Sistema de geração de relatórios.
//  O sistema gera relatórios em diferentes formatos, essa geração envolve etapadas fixas e a etapa de layout que varia
//  de acordo com o tipo de relatório selecionado.
//  Atualmente, essas operações estão duplicadas na classe RelatorioService, tornando o código acoplado, repetitivo e difícil de manter.
//  .
//  Refatore o código utilizando o padrão de projeto Template Method.


public class Main {

    public static void main(String[] args) {

        RelatorioService service = new RelatorioService();
        service.gerarRelatorioHTML();
        System.out.println("============================");
        service.gerarRelatorioPDF();
        System.out.println("============================");
        service.gerarRelatorioJSON();
        System.out.println("============================");
        service.gerarRelatorioCSV();
    }
}
