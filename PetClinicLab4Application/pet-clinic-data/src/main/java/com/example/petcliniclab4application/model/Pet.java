package com.example.petcliniclab4application.model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthdate;

    public String getName(){
        return name;
    }

    public PetType getPetType() {
        return petType;
    }
    public void setPetType(){
        this.petType = petType;
    }
}
