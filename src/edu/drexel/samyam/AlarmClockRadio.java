package edu.drexel.samyam;


public class AlarmClockRadio {
    protected Radio radio;
    protected AlarmClock alarmClock;

    public Station getRadioStation() {
        return radio.getRadioStation();
    }

    public void setRadioStation(Station station) {
        radio.setRadioStation(station);
    }

    public String getCurrentTime() {
        return alarmClock.showTime();
    }

    public void setCurrentTime(TimeClass currentTime) {
        alarmClock.currentTime = currentTime;
    }

    public AlarmClock getAlarmClock() {
        return alarmClock;
    }

    public void setAlarmClock(AlarmClock alarmClock) {
        this.alarmClock = alarmClock;
    }

    public String getAlarmTime() {
        return alarmClock.getAlarmTime();

    }

    public void setAlarmTime(TimeClass alarmTime) {
        alarmClock.setAlarmTime(alarmTime);
    }

    public void turnAlarmOn() {
        alarmClock.turnAlarmOn();
    }

    public void turnAlarmOff() {
        alarmClock.turnAlarmOff();

    }

    public void snooze() {
        alarmClock.snooze();
    }


    public boolean checkAlarm() {
        if (alarmClock.checkAlarm()) {

            alarmClock.playAlarmSound();

        }
        return alarmClock.checkAlarm();

    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void tick() {
        alarmClock.tick();
    }

    public void turnRadioOn() {
        radio.turnRadioOn();

    }

    public void turnRadioOff() {
        radio.turnRadioOff();
        System.out.println("The radio is turned off.");
    }


}


