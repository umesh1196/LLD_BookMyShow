package com.example.demo.repository;

import com.example.demo.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Long> {

    City save(City city);

    List<City> findAll();

    City getCityByNameOfCity(String cityName);
}
