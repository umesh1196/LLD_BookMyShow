package com.example.demo.controller;

import com.example.demo.dto.GetAuditoriumResponseDTO;
import com.example.demo.dto.Status;
import com.example.demo.models.Auditorium;
import com.example.demo.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AuditorumController {

    private AuditoriumService auditoriumService;

    @Autowired
    public AuditorumController(AuditoriumService auditoriumService)
    {
        this.auditoriumService = auditoriumService;
    }
    @RequestMapping(
            value = "/bookmyshow/auditorium/getAuditoriumsByTheatreName/{theatreid}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody
    public GetAuditoriumResponseDTO getAuditoriumsForTheatre(String theatreName)
    {
        GetAuditoriumResponseDTO getAuditoriumResponseDTO = new GetAuditoriumResponseDTO();
        List<Auditorium> auditoriumList  = auditoriumService.getAuditoriumByTheatreName(theatreName);
        getAuditoriumResponseDTO.setTheatreName(theatreName);
        getAuditoriumResponseDTO.setStatus(Status.SUCCESS);
        getAuditoriumResponseDTO.setAuditorumList(auditoriumList);
        return getAuditoriumResponseDTO;
    }


}
