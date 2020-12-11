package main;

import model.AudioMp3;
import model.AudioWav;
import model.AudioWmaAdapter;
import model.Wma;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("************************************************************");
        System.out.println("Iniciando o Sistema Adapter com base no problema dos formatos de Áudio...");
        Player player = new Player();
        System.out.println("************************************************************");
        System.out.println("Testando formato MP3...");
        player.setAudio(new AudioMp3());
        player.testeAudio("testeMP3");
        System.out.println("************************************************************");
        System.out.println("Testando formato WAV...");
        player.setAudio(new AudioWav());
        player.testeAudio("testeWAV");
        System.out.println("************************************************************");
        System.out.println("Testando formato WMA...");
        Wma wma = new Wma();
        player.setAudio(new AudioWmaAdapter(wma));
        player.testeAudio("testeWMA");
        System.out.println("************************************************************");
        System.out.println("Testando formato MP3...");
        player.setAudio(new AudioMp3());
        player.testeExcecao("testeMP3");
        System.out.println("************************************************************");
        System.out.println("Testando formato WAV...");
        player.setAudio(new AudioWav());
        player.testeExcecao("testeWAV");
        System.out.println("************************************************************");
        System.out.println("Testando formato WMA...");
        wma = new Wma();
        player.setAudio(new AudioWmaAdapter(wma));
        player.testeExcecao("testeWMA");
    }
}