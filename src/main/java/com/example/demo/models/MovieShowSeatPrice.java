package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieShowSeatPrice extends BaseModel{

    @ManyToOne
    private MovieShow movieShow;

    private SeatType seatType;

    private long seatPrice;


}
