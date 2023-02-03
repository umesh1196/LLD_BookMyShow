package com.example.demo.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel{

    private String auditoriumNo;

    @ElementCollection
    @Enumerated
    private List<Feature> typesSupported;
}
