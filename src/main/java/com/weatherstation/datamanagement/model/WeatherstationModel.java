package com.weatherstation.datamanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "WEATHERSTATIONS")
@SequenceGenerator(name="seq", initialValue=4, allocationSize=100)
public class WeatherstationModel {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    private Long id;
    String wslocation;
    float temperature;
    float airpressure;
    float windspeed;
 
    public WeatherstationModel() {
        // Empty Constructor
    }

    public WeatherstationModel(Long id, String wslocation, float temperature, float airpressure, float windspeed) {
        this.id = id;
        this.wslocation = wslocation;
        this.temperature = temperature;
        this.airpressure = airpressure;
        this.windspeed = windspeed;
    }

    public Long getId() {
        return id;
    }

    public String getWslocation() {
        return wslocation;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getAirpressure() {
        return airpressure;
    }

    public float getWindspeed() {
        return windspeed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWslocation(String wslocation) {
        this.wslocation = wslocation;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setAirpressure(float airpressure) {
        this.airpressure = airpressure;
    }

    public void setWindspeed(float windspeed) {
        this.windspeed = windspeed;
    }
}
