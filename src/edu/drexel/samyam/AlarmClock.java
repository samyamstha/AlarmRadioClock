package edu.drexel.samyam;


public class AlarmClock extends Clock {

    protected final int SNOOZE_TIME = 9;
    protected TimeClass snoozeAlarmTime;
    protected boolean isAlarmOn;
    protected TimeClass initialAlarmTime;
    protected boolean isSnoozeOn = false;
    protected SoundClass soundClass;


    public String getAlarmTime() {
        return initialAlarmTime.showTime();
    }

    public void setAlarmTime(TimeClass alarmTime) {
        this.initialAlarmTime = alarmTime;
        turnAlarmOn();
    }

    public SoundClass getSoundClass() {
        return soundClass;
    }

    public void setSoundClass(SoundClass soundClass) {
        this.soundClass = soundClass;
    }

    public void turnAlarmOn() {
        this.isAlarmOn = true;

    }

    public void turnAlarmOff() {
        this.isAlarmOn = false;
        this.snoozeAlarmTime = null;
        System.out.println("The alarm was shut off.");
    }

    //create a new obj of the TimeClass if snooze is pressed for the first time and add snoozetime
    //Else add snooze time to th existing object
    public void snooze() {
//        int minF,hoursF,secondsF;
//        String meridiemF;

        if (snoozeAlarmTime == null) {
            this.snoozeAlarmTime = new TimeClass(initialAlarmTime.hours, initialAlarmTime.mins + SNOOZE_TIME, initialAlarmTime.seconds, initialAlarmTime.meridiem);
        } else {

         /*   if (snoozeAlarmTime.mins+SNOOZE_TIME > 60){
                min = (snoozeAlarmTime.mins + SNOOZE_TIME) - 60 ;
                hours = snoozeAlarmTime.hours++;
                if (hours > 12){
                    hours = 1;
                    meridiem = snoozeAlarmTime.meridiem.equalsIgnoreCase("AM") ? "PM" : "AM";
                }

            }*/
            snoozeAlarmTime = new TimeClass(snoozeAlarmTime.hours, snoozeAlarmTime.mins + SNOOZE_TIME, snoozeAlarmTime.seconds, snoozeAlarmTime.meridiem);
        }
        isSnoozeOn = true;
        System.out.println("Snooze was pressed");
    }

    //check if it is the time for the alarm
    public boolean checkAlarm() {

        if (!isSnoozeOn) {
            if (getCurrentTime().hours == initialAlarmTime.hours && getCurrentTime().mins == initialAlarmTime.mins && getCurrentTime().seconds == initialAlarmTime.seconds && getCurrentTime().meridiem == initialAlarmTime.meridiem) {

                return true;
            }
        } else {
            if (getCurrentTime().hours == snoozeAlarmTime.hours && getCurrentTime().mins == snoozeAlarmTime.mins && getCurrentTime().seconds == snoozeAlarmTime.seconds && getCurrentTime().meridiem == snoozeAlarmTime.meridiem) {

                return true;
            }
        }


        return false;

    }

    //play the alarm sound that's set
    public void playAlarmSound() {
        soundClass.playSound();
    }


}
