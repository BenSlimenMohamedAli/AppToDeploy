package com.weatherstation.datamanagement.model;

public final class AverageTemp {
    private  int weatherstations;
    private double temperature;

    public AverageTemp(){
        // Empty Constructor
    }

    public AverageTemp(int weatherstations, double temp) {
        this.weatherstations = weatherstations;
        this.temperature = temp;
    }

    public int getWeatherstations() {
        return this.weatherstations;
    }   

    public double getTemperature() {
        return this.temperature;
    }

    public void setWeatherstations(int weatherstations) {
        this.weatherstations = weatherstations;
    }

    public void setTemperature(double averagetemp) {
        this.temperature = averagetemp;
    }
}
