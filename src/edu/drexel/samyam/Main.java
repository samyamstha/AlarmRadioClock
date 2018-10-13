package edu.drexel.samyam;

public class Main {

    public static void main(String[] args) {


        AlarmClockRadio alarmClockRadio = new AlarmClockRadio();


        alarmClockRadio.setAlarmClock(new AlarmClock());
        alarmClockRadio.setRadio(new Radio());
        alarmClockRadio.turnRadioOn();
        alarmClockRadio.setRadioStation(new Station("1060 AM"));
        alarmClockRadio.setCurrentTime(new TimeClass(8, 00, 00, "AM"));
        alarmClockRadio.setAlarmTime(new TimeClass(8, 5, 0, "AM"));
        System.out.println(alarmClockRadio.getAlarmTime());


        boolean initial = true;

        for (int i = 0; i <= 5; i++) {
            if (initial) {
                System.out.println("The initial time is " + alarmClockRadio.getCurrentTime());
                if (alarmClockRadio.radio.isRadioOn){
                    System.out.println("The radio was turned on and is playing " + alarmClockRadio.getRadioStation().getStationName());
                }
                initial = !initial;
            } else {
                System.out.print(alarmClockRadio.getCurrentTime() + " ");
            }
            for (int seconds = 0; seconds < 60; seconds++) {

                alarmClockRadio.checkAlarm();
                alarmClockRadio.tick();
            }

        }

        alarmClockRadio.snooze();
        for (int i = 0; i < 9; i++) {
            System.out.print(alarmClockRadio.getCurrentTime() + " ");
            for (int seconds = 0; seconds < 60; seconds++) {
                alarmClockRadio.checkAlarm();
                alarmClockRadio.tick();
            }
        }
        alarmClockRadio.turnAlarmOff();
    }
}
