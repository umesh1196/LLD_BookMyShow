package com.example.demo.dto;

import com.example.demo.models.Theatre;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter@Getter
public class GetAllTheatresResponseDTO {

    private ResponseStatusDTO responseStatusDTO;
    private List<Theatre> theatreList;

}
