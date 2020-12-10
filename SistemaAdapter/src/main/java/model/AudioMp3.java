package model;

public class AudioMp3 implements FormatoAudio{
    
    private String audio;
    private Boolean reproduzindo;
    
    public AudioMp3(){
        audio = null;
        reproduzindo = false;
    }

    @Override
    public void abrir(String audio) {
        if (audio != null) {
            this.audio = audio;
            System.out.println("Áudio " + audio + " no formato MP3 pronto para ser reproduzido!");    
        }
    }

    @Override
    public void reproduzir() {
        if (audio != null) {
            reproduzindo = true;
            System.out.println("Está sendo reproduzido o áudio " + audio + "!");
        } else{
            System.out.println("Não foi definido um áudio MP3 ainda!");
        }
    }

    @Override
    public void parar() {
        if (reproduzindo) {
            System.out.println("A reprodução do áudio " + audio + " foi interrompida!");
            audio = null;
        } else{
            System.out.println("Nenhum áudio MP3 em reprodução!");
        }
    }
}