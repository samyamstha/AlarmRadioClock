package edu.drexel.samyam;

public class Station {

    private String stationName;

    public Station(String stationName) {
        this.stationName = stationName;
       //System.out.println("Here :" + stationName);
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
