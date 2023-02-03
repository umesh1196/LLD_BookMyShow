package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieShowSeatBookings extends BaseModel{

    @ManyToOne
    private MovieShow movieShow;

    @ManyToOne
    private Seat seat;

    @Enumerated(value = EnumType.STRING)
    private MovieShowSeatStatus movieShowSeatStatus;

}
