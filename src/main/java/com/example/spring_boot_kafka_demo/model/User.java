package com.example.spring_boot_kafka_demo.model;

import lombok.Getter;
import lombok.Setter;

public class User{
    @Getter @Setter private int id;
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private char gender;

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }
    
}