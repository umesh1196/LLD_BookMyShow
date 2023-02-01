package com.example.demo.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
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
    @Enumerated
    private List<Feature> movieFetaures;
}
