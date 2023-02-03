package com.example.demo.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Entity
@Getter
@Setter
public class Ticket extends BaseModel{

    @ManyToOne
    private User bookedMyUser;

    @OneToMany
    private List<MovieShowSeatBookings> seatBookings;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payements;

    @Enumerated(value = EnumType.STRING)
    private TicketStatus ticketStatus;

    private double totalAmount;

    private Time bookedAt;
}
