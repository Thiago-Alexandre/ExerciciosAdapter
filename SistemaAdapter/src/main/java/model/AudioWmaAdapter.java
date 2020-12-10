package model;

public class AudioWmaAdapter implements FormatoAudio{
    
    private final Wma wma;
    
    public AudioWmaAdapter(Wma wma){
        this.wma = wma;
    }

    @Override
    public void abrir(String audio) {
        if (audio != null) {
            wma.setFile(audio);
            wma.open();
            System.out.println("Áudio " + wma.getAudio() + " no formato WMA pronto para ser reproduzido!");    
        }
    }

    @Override
    public void reproduzir() {
        if (wma.getAudio() != null) {
            wma.setLocation(0);
            wma.play();
            System.out.println("Está sendo reproduzido o áudio " + wma.getAudio() + "!");
        } else{
            System.out.println("Não foi definido um áudio WMA ainda!");
        }
    }

    @Override
    public void parar() {
        if (wma.getReproducing()) {
            System.out.println("A reprodução do áudio " + wma.getAudio() + " foi interrompida!");
            wma.stop();
        } else{
            System.out.println("Nenhum áudio WMA em reprodução!");
        }
    }
}