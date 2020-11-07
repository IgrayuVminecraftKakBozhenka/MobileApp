package com.company;

public class Plane {
    private final String arrivalTime;
    private final String departureTime;
    private final int flightNumber;
    private PlaneStatus status;

    public Plane(String arrivalTime, String departureTime, int flightNumber, PlaneStatus status) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public String getPlaneArrivalTime() {
        return arrivalTime;
    }

    public String getPlaneDepartureTime() {
        return departureTime;
    }

    public int getPlaneFlightNumber() {
        return flightNumber;
    }

    public PlaneStatus getPlaneStatus() {
        return status;
    }

    public void setStatus(PlaneStatus status) {
        this.status = status;
    }

    public Plane sendRequest() {
        return this;
    }

}
