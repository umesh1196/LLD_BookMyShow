package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
public class MovieShow extends BaseModel{

    @ManyToOne
    private Movie movie;

    private Time startTime;

    private Time endTime;

    @ManyToOne
    private Auditorium auditorium;

    @OneToMany(mappedBy = "movieShow")
    private List<MovieShowSeatPrice> movieSeatPricing;

    @OneToMany(mappedBy = "movieShow")
    private List<MovieShowSeatBookings> movieShowSeatBookings;

}
