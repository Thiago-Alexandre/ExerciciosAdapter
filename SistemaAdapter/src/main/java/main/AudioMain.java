package main;

import model.AudioMp3;
import model.AudioWav;
import model.AudioWmaAdapter;
import model.FormatoAudio;
import model.Wma;

public class AudioMain {
    
    public static FormatoAudio audio;
    
    public static void main(String[] args) {
        
        System.out.println("************************************************************");
        System.out.println("Iniciando o Sistema Adapter com base no problema dos formatos de Áudio...");
        System.out.println("************************************************************");
        System.out.println("Testando formato MP3...");
        audio = new AudioMp3();
        testeAudio("testeMP3");
        System.out.println("************************************************************");
        System.out.println("Testando formato WAV...");
        audio = new AudioWav();
        testeAudio("testeWAV");
        System.out.println("************************************************************");
        System.out.println("Testando formato WMA...");
        Wma wma = new Wma();
        audio = new AudioWmaAdapter(wma);
        testeAudio("testeWMA");
        System.out.println("************************************************************");
        System.out.println("Iniciando o Sistema Adapter com exceções...");
        System.out.println("************************************************************");
        System.out.println("Testando formato MP3...");
        audio = new AudioMp3();
        testeExcecao("testeMP3");
        System.out.println("************************************************************");
        System.out.println("Testando formato WAV...");
        audio = new AudioWav();
        testeExcecao("testeWAV");
        System.out.println("************************************************************");
        System.out.println("Testando formato WMA...");
        wma = new Wma();
        audio = new AudioWmaAdapter(wma);
        testeExcecao("testeWMA");
    }
    
    public static void testeAudio(String arquivo){
    
        System.out.println("Abrindo arquivo...");
        audio.abrir(arquivo);
        System.out.println("------------------------------");
        System.out.println("Iniciando reprodução do arquivo...");
        audio.reproduzir();
        System.out.println("------------------------------");
        audio.parar();
        System.out.println("------------------------------");
    }
    
    public static void testeExcecao(String arquivo){
        
        audio.parar();
        System.out.println("------------------------------");
        audio.reproduzir();
        System.out.println("------------------------------");
        audio.parar();
        System.out.println("------------------------------");
        audio.abrir(arquivo);
        System.out.println("------------------------------");
        audio.parar();
        System.out.println("------------------------------");
    }
}