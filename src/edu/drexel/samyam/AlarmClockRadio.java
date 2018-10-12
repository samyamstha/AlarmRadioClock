package edu.drexel.samyam;


public class AlarmClockRadio {
    private Radio radio;
    private AlarmClock alarmClock;
    private int secondsCounter;


   public void setRadioStation(Station station){
       radio.setRadioStation(station);
   }

    public Station getRadioStation(){
        return radio.getRadioStation();
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

    public void setAlarmTime(TimeClass alarmtime){
       alarmClock.setAlarmTime(alarmtime);
    }

    public void getAlarmTime(){


    }

    public void turnAlarmOn(){

    }

    public void turnAlarmOff(){
        System.out.println("The alarm was shut off.");

    }

    public void snooze() {
       alarmClock.snooze();

    }

    public boolean checkAlarm() {
        return alarmClock.checkAlarm();
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void tick(){
       alarmClock.tick();
    }





}
