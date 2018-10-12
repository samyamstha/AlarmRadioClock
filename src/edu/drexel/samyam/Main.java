package edu.drexel.samyam;

public class Main {

    public static void main(String[] args) {



        AlarmClockRadio alarmClockRadio = new AlarmClockRadio();


        alarmClockRadio.setAlarmClock(new AlarmClock());
        alarmClockRadio.setRadio(new Radio());
        alarmClockRadio.setRadioStation(new Station("1060 AM"));
        System.out.println("Station: " + alarmClockRadio.getRadioStation().getStationName());
        alarmClockRadio.setCurrentTime(new TimeClass(8,00, 00, "AM"));
        alarmClockRadio.setAlarmTime(new TimeClass(8, 5, 0, "AM"));


        System.out.println("The initial time is " + alarmClockRadio.getCurrentTime());
        System.out.println("The radio was turned on and is playing " + alarmClockRadio.getRadioStation().getStationName());


      for (int i = 0; i <= 5; i++)
        {
            System.out.println("Time: " + alarmClockRadio.getCurrentTime());

            for (int seconds = 0; seconds < 60; seconds++)
            {
                if (alarmClockRadio.checkAlarm()) {
                    System.out.println("Buzz Buzz Buzz!");
                    break;
                }
                alarmClockRadio.tick();

            }

        }


       alarmClockRadio.snooze();
        for (int i = 0; i < 9; i++)
        {

            for (int seconds = 0; seconds < 60; seconds++)
            {
                alarmClockRadio.checkAlarm();
                alarmClockRadio.tick();

            }
            System.out.println("Time: " + alarmClockRadio.getCurrentTime());
        }
        alarmClockRadio.turnAlarmOff();
    }
}
