package com.example.weatherforecast.controllers;

import com.example.weatherforecast.models.WeatherForecast;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/weather")

public class WeatherForecastController {

    private static final String[] SUMMARIES = {
            "Freezing", "Bracing", "Chilly", "Cool", "Mild",
            "Warm", "Balmy", "Hot", "Sweltering", "Scorching"
    };

    @GetMapping
    public List<WeatherForecast> getWeatherForescast(){
        List<WeatherForecast> forecasts = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
           WeatherForecast forecast = new WeatherForecast();
           forecast.setDate(LocalDate.now().plusDays(i));
           forecast.setTemperatureC(random.nextInt(-20, 56));
           forecast.setSummary(SUMMARIES[random.nextInt(SUMMARIES.length)]);
           forecasts.add(forecast);
        }

        return forecasts;
    }
}
