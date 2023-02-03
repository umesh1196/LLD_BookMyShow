package com.example.demo.service;

import com.example.demo.models.Auditorium;
import com.example.demo.models.City;
import com.example.demo.models.Theatre;
import com.example.demo.repository.AuditoriumRepository;
import com.example.demo.repository.CityRepository;
import com.example.demo.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TheatreService {

    private CityRepository cityRepository;

    private TheatreRepository theatreRepository;

    private AuditoriumRepository auditoriumRepository;

    @Autowired
    public TheatreService(CityRepository cityRepository,TheatreRepository theatreRepository,AuditoriumRepository auditoriumRepository)
    {
        this.cityRepository = cityRepository;
        this.theatreRepository = theatreRepository;
        this.auditoriumRepository = auditoriumRepository;
    }
    public Theatre createTheatre(String theatreName,String theatreAddress,List<Auditorium> noOfAuditoriums,String cityName)
    {
        City city = cityRepository.getCityByNameOfCity(cityName);

        Theatre theatre = new Theatre();
        theatre.setTheatreName(theatreName);
        theatre.setAddress(theatreAddress);
        theatre.setCity(city);
        theatre.setAuditoriumList(noOfAuditoriums);
        return theatreRepository.save(theatre);
    }

    public List<Theatre> getAllTheatres()
    {
        return theatreRepository.findAll();
    }

    @Transactional
    public void deleteTheatreAudi(String theatreName,String audiName)
    {
        Theatre theatre = theatreRepository.findByTheatreName(theatreName);

        Optional<Auditorium> audiToRemove
         = theatre.getAuditoriumList().stream().filter(audi -> audi.getAuditoriumNo().equals(audiName)).findFirst();

        if(audiToRemove.isPresent())
        {
            theatre.getAuditoriumList().removeIf(audi -> audiToRemove.get().getAuditoriumNo().equals(audi.getAuditoriumNo()));
            theatreRepository.save(theatre);
            audiToRemove.get().setTypesSupported(null);
            auditoriumRepository.deleteAuditoriumByAuditoriumNo(audiToRemove.get().getAuditoriumNo());
        }
    }
}
