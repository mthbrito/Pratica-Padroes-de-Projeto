package org.example.PraticaPadroesEstruturais.composite;

public class SistemaArquivos {

    public static void main(String[] args) {
        Arquivo foto = new Arquivo("foto.jpg");
        Arquivo texto = new Arquivo("documento.txt");
        
        Pasta imagens = new Pasta("Imagens");
        imagens.adicionaItem(foto);

        Pasta documentos = new Pasta("Documentos");
        documentos.adicionaItem(texto);

        Pasta raiz = new Pasta("Meu Computador");
        raiz.adicionaItem(imagens);
        raiz.adicionaItem(documentos);

        raiz.listar();
    }
}
