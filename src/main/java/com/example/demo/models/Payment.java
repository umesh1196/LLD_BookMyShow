package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{

    @Enumerated
    private PaymentMode paymentMode;

    @Enumerated
    private PaymentStatus paymentStatus;

    private String transactionId;

    private Time bookedAt;

    @ManyToOne
    private Ticket ticket;

}
