package edu.drexel.samyam;


public class Clock {

    protected TimeClass currentTime;

    public TimeClass getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(TimeClass currentTime) {
        this.currentTime = currentTime;
    }

    public String showTime() {
        return currentTime.showTime();
    }

    //Add one second to the current time and respectively increase the time.
    public void tick() {
        currentTime.seconds++;

        if (currentTime.seconds == currentTime.MAX_SECONDS) {
            currentTime.seconds = 0;
            currentTime.mins++;
        }

        if (currentTime.mins == currentTime.MAX_MINS) {
            currentTime.mins = 0;
            currentTime.hours++;
        }

        if (currentTime.hours == currentTime.MAX_HOURS) {
            if (currentTime.meridiem.equalsIgnoreCase("AM")){
                currentTime.meridiem = "PM";
            }else{
                currentTime.meridiem = "AM";
            }
            currentTime.hours = 1;
        }

    }

}
