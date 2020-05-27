package com.steppedua.jobhunters.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String position;
    private String name;
    private String surname;
    private Long age;
    private String phone;
    private String email;
    private String skills;
    private String experience;

    public Resume() {
    }

    public Resume(String position, String name, String surname) {
        this.position = position;
        this.name = name;
        this.surname = surname;
    }

    public Resume(String position, String name, String surname, Long age, String phone, String email, String skills, String experience) {
        this.position = position;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.skills = skills;
        this.experience = experience;
    }
}