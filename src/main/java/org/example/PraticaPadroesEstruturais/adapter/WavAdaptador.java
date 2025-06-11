package org.example.PraticaPadroesEstruturais.adapter;

public class WavAdaptador extends Mp3Player{

    private final WavPlayerLib wavPlayerLib;

    public WavAdaptador(WavPlayerLib wavPlayerLib) {
        this.wavPlayerLib = wavPlayerLib;
    }

    @Override
    public void playMp3(String nomeArquivo){
        System.out.println("Usando adaptador... " + nomeArquivo);
        wavPlayerLib.playWavArquivo(nomeArquivo);
    }



}
