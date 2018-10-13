package edu.drexel.samyam;

public class Radio {

    protected Station currentRadioStation;
    protected int volume;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    protected boolean isRadioOn;


    public Station getRadioStation() {
        return currentRadioStation;
    }

    public void setRadioStation(Station currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }else{
            System.out.println("Volume has to be within 0 to 100.");
        }
    }

    public void turnRadioOn(){
        this.isRadioOn = true;

    }

    public void turnRadioOff(){
        this.isRadioOn = false;
    }
}
