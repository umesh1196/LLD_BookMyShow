package com.example.demo.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Actor extends BaseModel{

    private String Name;

    @ManyToMany(mappedBy = "actors")
    private List<Movie> moviesActedIn;

    @ElementCollection
    @Enumerated(value = EnumType.STRING)
    private List<Feature> movieFetaures;
}
