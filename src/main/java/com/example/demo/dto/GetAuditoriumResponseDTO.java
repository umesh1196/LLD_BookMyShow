package com.example.demo.dto;

import com.example.demo.models.Auditorium;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class GetAuditoriumResponseDTO {
    private Status status;
    private String theatreName;
    private List<Auditorium> auditorumList;


}
