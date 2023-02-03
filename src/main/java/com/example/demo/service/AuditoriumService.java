package com.example.demo.service;

import com.example.demo.models.Auditorium;
import com.example.demo.models.Theatre;
import com.example.demo.repository.AuditoriumRepository;
import com.example.demo.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriumService {

    private TheatreRepository theatreRepository;

    @Autowired
    public AuditoriumService(TheatreRepository theatreRepository)
    {
        this.theatreRepository = theatreRepository;
    }

    public List<Auditorium> getAuditoriumByTheatreName(String theatreName)
    {
        return theatreRepository.findByTheatreName(theatreName).getAuditoriumList();
    }
}
