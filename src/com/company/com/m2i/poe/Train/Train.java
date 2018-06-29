package com.company.com.m2i.poe.Train;

public class Train {

    private int id;
    private String origin;
    private String destination;
    private double time;
    private double duration;

    public Train() {
    }

    public Train(int id, String origin, String destination, double time, double duration) {
        this.id = id;
    }

    public Train(int id, String origin, String destination) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.time = time;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
