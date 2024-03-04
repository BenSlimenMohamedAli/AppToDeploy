package com.weatherstation.datamanagement.services;

import com.weatherstation.datamanagement.model.WeatherstationModel;
import com.weatherstation.datamanagement.model.AverageTemp;
import com.weatherstation.datamanagement.repositories.WeatherstationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.OptionalDouble;

@Service
public class WeatherStatisticsService {
    
    @Autowired
    private transient WeatherstationRepository repository;

    public AverageTemp getAverageTemperature() {
        float summe=0;

        List<WeatherstationModel> weatherstations = repository.findAll();

        WeatherstationModel[] array = new WeatherstationModel[weatherstations.size()];
        weatherstations.toArray(array);

        for(int i=0;i < array.length;i++) {
            summe += array[i].getTemperature();
        }
        float avgtemp = summe/array.length;

        //return new AverageTemp(weatherstations.size(), average.getAsDouble());
        return new AverageTemp(weatherstations.size(), avgtemp);
    }
}
