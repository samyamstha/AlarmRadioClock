package edu.drexel.samyam;

public class Radio {

    private Station currentRadioStation;
    private int volume;


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
        this.volume = volume;
    }
}
