package model;

public interface WmaPlay {
    
    public void setFile(String audio);
    public void open();
    public void setLocation(int posicao);
    public void play();
    public void stop();
}