package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel{

    private String theatreName;

    private String address;

    @OneToMany
    private List<Auditorium> auditoriumList;

    @OneToOne
    private City city;


}
