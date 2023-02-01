package com.example.demo.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel{

    private String auditoriumNo;

    @ElementCollection
    @Enumerated
    private List<Feature> typesSupported;



}
