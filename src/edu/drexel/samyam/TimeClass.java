package edu.drexel.samyam;

public class TimeClass {

    protected final int MAX_HOURS = 12;
    protected final int MAX_MINS = 60;
    protected final int MAX_SECONDS = 60;

    protected int hours;
    protected int mins;
    protected int seconds;
    protected String meridiem;

    public TimeClass(int hours, int mins, int seconds, String meridiem) {
        this.hours = hours;
        this.mins = mins;
        this.seconds = seconds;
        this.meridiem = meridiem;
    }


    public String showTime(){
        return String.valueOf(hours) + ":" + String.valueOf(mins) + " " +String.valueOf(meridiem);
    }
}
