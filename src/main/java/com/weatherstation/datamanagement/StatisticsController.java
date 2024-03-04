package com.weatherstation.datamanagement;

import com.weatherstation.datamanagement.model.AverageTemp;
import com.weatherstation.datamanagement.services.WeatherStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("statistics")
public class StatisticsController {
    
    @Autowired
    private transient WeatherStatisticsService service;

    @GetMapping(value = "/{averagetemp}")
    public AverageTemp getAverageTemperature() {
        return service.getAverageTemperature();
    }
}
