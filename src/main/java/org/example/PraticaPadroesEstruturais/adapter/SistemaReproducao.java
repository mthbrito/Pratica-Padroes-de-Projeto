package org.example.PraticaPadroesEstruturais.adapter;

public class SistemaReproducao {
    public static void main(String[] args) {

        String nomeArquivo = "voz.wav";
        WavPlayerLib wavPlayer = new WavPlayerLib();
        Mp3Player mp3Player = new WavAdaptador(wavPlayer);
        mp3Player.playMp3(nomeArquivo);

    }
}
