package edu.drexel.samyam;

public class Main {

    public static void main(String[] args) {

//Instantiation and initialization
        AlarmClockRadio alarmClockRadio = new AlarmClockRadio();
        AlarmClock alarmClock = new AlarmClock();
        Radio radio = new Radio();
        RadioSound radioSound = new RadioSound();
        radioSound.setRadio(radio);

        //set the alarm sound
        alarmClock.setSoundClass(radioSound);

        /*if you want to set the alarm sound as "Buzz Buzz Buzz", just do alarmClock.setSoundClass(new BuzzSound()).*/
        //alarmClock.setSoundClass(new BuzzSound());

        alarmClockRadio.setAlarmClock(alarmClock);
        alarmClockRadio.setRadio(radio);
        alarmClockRadio.turnRadioOn();
        alarmClockRadio.setRadioStation(new Station("1060 AM"));

        //set the current time
        alarmClockRadio.setCurrentTime(new TimeClass(8, 00, 00, "AM"));

        //set the alarm time
        alarmClockRadio.setAlarmTime(new TimeClass(8, 5, 0, "AM"));


        boolean initial = true;

        for (int i = 0; i <= 5; i++) {
            if (initial) {
                System.out.println("The initial time is " + alarmClockRadio.getCurrentTime());
                if (alarmClockRadio.radio.isRadioOn) {
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
