package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.models.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreateCitiesController {

    private CityService cityService;

    @Autowired
    public CreateCitiesController(CityService cityService)
    {
        this.cityService = cityService;
    }
    @RequestMapping(
            value = "/bookmyshow/createcity",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json"
    )
    @ResponseBody
    public CreateCitiesResponseDTO createCity(@RequestBody CreateCitiesRequestDTO createCitiesRequestDTO)
    {
        City city = cityService.createCity(createCitiesRequestDTO.getCityName());
        CreateCitiesResponseDTO createCitiesResponseDTO = new CreateCitiesResponseDTO();
        ResponseStatusDTO responseStatusDTO = new ResponseStatusDTO();
        responseStatusDTO.setResponseStatus(Status.SUCCESS);
        createCitiesResponseDTO.setCity(city);
        createCitiesResponseDTO.setResponseStatusDTO(responseStatusDTO);
        return createCitiesResponseDTO;
    }

    @RequestMapping(
            value = "/bookmyshowg/getAllCities",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public GetAllCitiesResponseDTO getAllCities()
    {
        GetAllCitiesResponseDTO getAllCitiesResponseDTO = new GetAllCitiesResponseDTO();
        getAllCitiesResponseDTO.setListOfCities(cityService.getAllCities());
        ResponseStatusDTO responseStatusDTO = new ResponseStatusDTO();
        responseStatusDTO.setResponseStatus(Status.SUCCESS);
        getAllCitiesResponseDTO.setResponseStatus(responseStatusDTO);
        return getAllCitiesResponseDTO;
    }
}
