package edu.drexel.samyam;



public class AlarmClock extends Clock{

protected final int SNOOZE_TIME = 9;
    protected TimeClass snoozeAlarmTime;
    protected  boolean isAlarmOn;
    protected TimeClass initialAlarmTime;
    protected boolean isSnoozeOn = false;


    public void setAlarmTime(TimeClass alarmTime){
        this.initialAlarmTime = alarmTime;
        turnAlarmOn();
    }

    public String getAlarmTime(){
        return initialAlarmTime.showTime();
    }

    public void turnAlarmOn(){
        this.isAlarmOn = true;

    }

    public void turnAlarmOff(){
        this.isAlarmOn = false;
        this.snoozeAlarmTime = null;
        System.out.println("The alarm was shut off.");
    }

    public void snooze() {
        if (snoozeAlarmTime == null){
            this.snoozeAlarmTime = new TimeClass(initialAlarmTime.hours, initialAlarmTime.mins+SNOOZE_TIME, initialAlarmTime.seconds, initialAlarmTime.meridiem);
        }else{
        snoozeAlarmTime = new TimeClass(snoozeAlarmTime.hours, snoozeAlarmTime.mins+SNOOZE_TIME, snoozeAlarmTime.seconds, snoozeAlarmTime.meridiem);
        }
        isSnoozeOn = true;
        System.out.println("Snooze was pressed");
    }

    public boolean checkAlarm() {

        if (!isSnoozeOn){
            if (getCurrentTime().hours == initialAlarmTime.hours && getCurrentTime().mins == initialAlarmTime.mins && getCurrentTime().seconds == initialAlarmTime.seconds && getCurrentTime().meridiem == initialAlarmTime.meridiem){
                //System.out.println("\nBuzz Buzz Buzz!");

                return true;
            }
        }else{
            if (getCurrentTime().hours == snoozeAlarmTime.hours && getCurrentTime().mins == snoozeAlarmTime.mins && getCurrentTime().seconds == snoozeAlarmTime.seconds && getCurrentTime().meridiem == snoozeAlarmTime.meridiem){
                //System.out.println("\nBuzz Buzz Buzz!");
                return true;
            }
        }


       return false;

    }


}
