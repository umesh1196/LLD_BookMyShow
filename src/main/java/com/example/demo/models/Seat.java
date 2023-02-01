package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{

    private String seatNo;

    private int rowId;

    private int columnNo;


    @Enumerated
    private SeatStatus seatStatus;


    @Enumerated
    private SeatType seatType;

}
