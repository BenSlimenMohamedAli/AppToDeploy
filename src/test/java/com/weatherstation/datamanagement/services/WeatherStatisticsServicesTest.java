package com.weatherstation.datamanagement.services;

import com.weatherstation.datamanagement.model.WeatherstationModel;
import com.weatherstation.datamanagement.repositories.WeatherstationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class WeatherStatisticsServicesTest {

    @InjectMocks
    private WeatherStatisticsService service;

    @Mock
    private WeatherstationRepository repo;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void oneWS() {
        List<WeatherstationModel> wsList = new ArrayList<>();
        WeatherstationModel ws = new WeatherstationModel(1L, "Test Station 1", 12.0f, 500.0f, 10.0f);
        wsList.add(ws);

        when(repo.findAll()).thenReturn(wsList);

        Assertions.assertEquals(service.getAverageTemperature().getTemperature(), 12.0f, 0.0f);
    }
}

