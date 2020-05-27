package com.steppedua.jobhunters.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String position;
    private String company;
    private String description;
    private String phone;
    private String email;
    private String experience;

    public Vacancy() {
    }

    public Vacancy(String position, String company, String experience) {
        this.position = position;
        this.company = company;
        this.experience = experience;
    }

    public Vacancy(String position, String company, String experience, String description, String phone, String email) {
        this.position = position;
        this.company = company;
        this.experience = experience;
        this.description = description;
        this.phone = phone;
        this.email = email;
    }
}