package com.example.demo.dto;

import com.example.demo.models.Auditorium;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateTheatreRequestDTO {
    private String theatreName;
    private String theatreAddress;
    private List<Auditorium> audiList;
    private String cityName;
}
