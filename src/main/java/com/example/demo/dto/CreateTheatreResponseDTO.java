package com.example.demo.dto;

import com.example.demo.models.Auditorium;
import com.example.demo.models.Theatre;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateTheatreResponseDTO {
    private ResponseStatusDTO responseStatusDTO;
    private Theatre theatre;

}
