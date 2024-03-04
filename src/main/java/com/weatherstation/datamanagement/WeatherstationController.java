package com.weatherstation.datamanagement;

import com.weatherstation.datamanagement.model.WeatherstationModel;
import com.weatherstation.datamanagement.repositories.WeatherstationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("weatherstations")
public class WeatherstationController {

    @Autowired
    private transient WeatherstationRepository repository;

    @GetMapping
    public List<WeatherstationModel> getWeatherstations() {
        return repository.findAll();
    }

    @PostMapping
    public WeatherstationModel addWeatherstation(@RequestBody WeatherstationModel car) {
        return repository.save(car);
    }

    @GetMapping(value = "/{id}")
    public WeatherstationModel getCarById(@PathVariable("id") long id) {
        return repository.getById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void removeCarById(@PathVariable("id") long id) {
        repository.deleteById(id);
    }
}
