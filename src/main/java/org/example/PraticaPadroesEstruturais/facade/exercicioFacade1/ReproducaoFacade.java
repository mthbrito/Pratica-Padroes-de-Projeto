package org.example.PraticaPadroesEstruturais.facade.exercicioFacade1;

public class ReproducaoFacade {

    private CarregadorDeArquivo carregadorDeArquivo = new CarregadorDeArquivo();
    private DecodificadorDeVideo decodificadorDeVideo = new DecodificadorDeVideo();
    private DecodificadorDeAudio decodificadorDeAudio = new DecodificadorDeAudio();
    private Reprodutor reprodutor = new Reprodutor();

    public ReproducaoFacade(CarregadorDeArquivo carregadorDeArquivo, DecodificadorDeVideo decodificadorDeVideo, DecodificadorDeAudio decodificadorDeAudio, Reprodutor reprodutor) {
        this.carregadorDeArquivo = carregadorDeArquivo;
        this.decodificadorDeVideo = decodificadorDeVideo;
        this.decodificadorDeAudio = decodificadorDeAudio;
        this.reprodutor = reprodutor;
    }

    public void reproduzir(String arquivo) {
        carregadorDeArquivo.carregar(arquivo);
        decodificadorDeVideo.decodificar();
        decodificadorDeAudio.decodificar();
        reprodutor.reproduzir();
    }
}
