package edu.drexel.samyam;



public class AlarmClock extends Clock{

    protected TimeClass alarmTime;
    protected  boolean isAlarmOn;


    public void setAlarmTime(TimeClass alarmTime){
        this.alarmTime = alarmTime;
        turnAlarmOn();
    }

    public void getAlarmTime(){


    }

    public void turnAlarmOn(){
        this.isAlarmOn = true;

    }

    public void turnAlarmOff(){
        this.isAlarmOn = false;
    }

    public void snooze() {
        alarmTime.mins += 9;
    }

    public boolean checkAlarm() {

       /* if (isAlarmOn == true){
            return true;
        }else{
            return false;
        }*/
       if (getCurrentTime().hours == alarmTime.hours && getCurrentTime().mins == alarmTime.mins){
           return true;
       }

       return false;

    }


}
