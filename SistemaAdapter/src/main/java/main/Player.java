package main;

import model.FormatoAudio;

public class Player {
    
    private FormatoAudio audio;

    public Player() {
        audio = null;
    }
    
    public void testeAudio(String audio){
        
        if (audio != null) {
            
            this.audio.abrir(audio);
            System.out.println("------------------------------");
            this.audio.reproduzir();
            System.out.println("------------------------------");
            this.audio.parar();
            System.out.println("------------------------------");
        }
    }
    
    public void testeExcecao(String audio){
        
        if (audio != null) {
            
            this.audio.parar();
            System.out.println("------------------------------");
            this.audio.reproduzir();
            System.out.println("------------------------------");
            this.audio.parar();
            System.out.println("------------------------------");
            this.audio.abrir(audio);
            System.out.println("------------------------------");
            this.audio.parar();
            System.out.println("------------------------------");
        }
    }

    public FormatoAudio getAudio() {
        return audio;
    }

    public void setAudio(FormatoAudio audio) {
        this.audio = audio;
    }
}