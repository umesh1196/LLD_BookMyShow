package com.example.demo.dto;

import com.example.demo.models.City;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCitiesResponseDTO {
    private ResponseStatusDTO responseStatusDTO;
    private City city;
}
