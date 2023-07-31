package com.ehome2u.doctormicroservice.domain.service;

import com.ehome2u.doctormicroservice.domain.model.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor createDoctor(String name, String regNo);

    List<Doctor> getAllDoctors();

    // Other domain-specific methods and business logic can be defined here
}

