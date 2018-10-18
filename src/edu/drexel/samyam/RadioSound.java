package edu.drexel.samyam;

public class RadioSound implements SoundClass{

    protected Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void playSound() {
        System.out.println("\nThe radio is playing " + radio.getRadioStation().getStationName());
    }
}
