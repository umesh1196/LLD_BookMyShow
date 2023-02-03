package com.example.demo.controller;


import com.example.demo.dto.*;
import com.example.demo.models.Theatre;
import com.example.demo.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TheatresController {

    private TheatreService theatreService;

    @Autowired
    public TheatresController(TheatreService theatreService)
    {
        this.theatreService = theatreService;
    }

    @RequestMapping(
            value = "/bookmyshow/theatre/createTheatre",
            method = RequestMethod.POST,
            produces = "application/json",
            consumes = "application/json"
    )
    @ResponseBody
    public CreateTheatreResponseDTO createTheatre(@RequestBody CreateTheatreRequestDTO createTheatreRequestDTO)
    {
        CreateTheatreResponseDTO createTheatreResponseDTO = new CreateTheatreResponseDTO();
        Theatre theatre = theatreService.createTheatre(createTheatreRequestDTO.getTheatreName(), createTheatreRequestDTO.getTheatreAddress(),createTheatreRequestDTO.getAudiList(),createTheatreRequestDTO.getCityName());
        ResponseStatusDTO responseStatusDTO = new ResponseStatusDTO();
        responseStatusDTO.setResponseStatus(Status.SUCCESS);
        createTheatreResponseDTO.setResponseStatusDTO(responseStatusDTO);
        createTheatreResponseDTO.setTheatre(theatre);
        return createTheatreResponseDTO;
    }

    @RequestMapping(
            value ="/bookmyshow/theatre/getAllTheatres",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public GetAllTheatresResponseDTO getAllTheatres()
    {
        GetAllTheatresResponseDTO getAllTheatresResponseDTO = new GetAllTheatresResponseDTO();
        List<Theatre> theatreList = theatreService.getAllTheatres();
        ResponseStatusDTO responseStatusDTO = new ResponseStatusDTO();
        responseStatusDTO.setResponseStatus(Status.SUCCESS);
        getAllTheatresResponseDTO.setTheatreList(theatreList);
        getAllTheatresResponseDTO.setResponseStatusDTO(responseStatusDTO);
        return getAllTheatresResponseDTO;
    }


    @RequestMapping(
            value = "/bookmyshow/theatre/deleteAuditoriumfortheatre/{theatreName}/{auditoriumName}",
            produces = "application/json",
            method = RequestMethod.GET
    )
    @ResponseBody
    public ResponseEntity<String> deleteAudiForTheatre(@PathVariable("theatreName") String theatreName,@PathVariable("auditoriumName") String auditoriumName)
    {
        theatreService.deleteTheatreAudi(theatreName,auditoriumName);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
