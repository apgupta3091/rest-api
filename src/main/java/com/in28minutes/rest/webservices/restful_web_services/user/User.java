package com.in28minutes.rest.webservices.restful_web_services.user;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {
    private Integer id;
    @Size(min = 2, message = "Name should have atleast 2 characters")
    private String name;
    @Past(message = "Birthdate should be in the past")
    private LocalDate birthData;

    public User(Integer id, String name, LocalDate birthData) {
        this.id = id;
        this.name = name;
        this.birthData = birthData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public void setBirthData(LocalDate birthData) {
        this.birthData = birthData;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthData=" + birthData +
                '}';
    }
}
