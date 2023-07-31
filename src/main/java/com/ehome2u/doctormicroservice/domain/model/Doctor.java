package com.ehome2u.doctormicroservice.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DOCTOR")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOCTOR_ID")
    public long id;

    @Column(name = "DOCTOR_NAME")
    public String name;

    @Column(name = "REGISTRATION_NO")
    public String regNo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
