package com.example.demo.service;

import com.example.demo.models.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository)
    {
        this.cityRepository = cityRepository;
    }

    public City createCity(String cityName)
    {
        City city = new City();
        city.setNameOfCity(cityName);
        return cityRepository.save(city);
    }


    public List<City> getAllCities()
    {
        return cityRepository.findAll();
    }
}
