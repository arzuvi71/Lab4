package com.example.lab4_20210740.Entity;

import jakarta.persistence.*;

@Entity
@Table (name="doctor_state")
public class Estado {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
