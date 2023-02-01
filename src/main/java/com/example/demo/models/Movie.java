package com.example.demo.models;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String movieName;

    @ManyToMany
    private List<Actor> actors;

    @ElementCollection
    @Enumerated
    private List<Genre> genreList;



 }
