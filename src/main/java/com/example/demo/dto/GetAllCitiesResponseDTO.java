package com.example.demo.dto;

import com.example.demo.models.City;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetAllCitiesResponseDTO {
    private ResponseStatusDTO responseStatus;
    private List<City> listOfCities;
}
