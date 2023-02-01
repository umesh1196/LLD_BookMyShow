package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    @Enumerated
    private TicketStatus ticketStatus;

    private double totalAmount;

    private Time bookedAt;
}
