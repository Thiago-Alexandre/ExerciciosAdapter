package model;

public class Wma implements WmaPlay{
    
    private String audio;
    private Boolean reproducing;
    private int location;
    
    public Wma(){
        audio = null;
        reproducing = false;
        location = -1;
    }

    @Override
    public void setFile(String audio) {
        this.audio = audio;
    }

    @Override
    public void open() {
        if (audio != null) {
            System.out.println("Audio " + audio + " in WMA format ready to be played!");
        } else{
            System.out.println("A WMA audio has not been defined!");
        }
    }

    @Override
    public void setLocation(int location) {
        if (location >= 0) {
            if (audio != null) {
                this.location = location;
            } else{
                System.out.println("A WMA audio has not been defined!");
            }    
        }
    }

    @Override
    public void play() {
        if (location >= 0) {
            reproducing = true;
            System.out.println("Audio " + audio + " is playing on location " + location + "!");
        } else{
            System.out.println("Undefined Location!");
        }
    }

    @Override
    public void stop() {
        if (reproducing) {
            System.out.println("Audio playback " + audio + " has been interrupted!");
            audio = null;
            location = -1;
        } else{
            System.out.println("No WMA audio playing!");
        }
    }

    public String getAudio() {
        return audio;
    }

    public Boolean getReproducing() {
        return reproducing;
    }

    public int getLocation() {
        return location;
    }
}