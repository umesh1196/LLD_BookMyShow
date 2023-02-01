package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseModel{

    private String name;

    private String address;

    private String userId;

    private String password;

    private UserType userType;
}
