package com.example.weatherforecast.models;

import java.time.LocalDate;

public class WeatherForecast {
    private LocalDate date;
    private  int temperatureC;
    private String summary;

    public int getTemperatureF(){
        return  32 + (int) (temperatureC / 0.5556);
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(int temperatureC) {
        this.temperatureC = temperatureC;
    }

    public String getSummary(){
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
