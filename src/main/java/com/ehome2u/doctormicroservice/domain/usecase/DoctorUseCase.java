package com.ehome2u.doctormicroservice.domain.usecase;

import com.ehome2u.doctormicroservice.domain.model.Doctor;

import java.util.List;

public interface DoctorUseCase {
    Doctor createDoctor(String name, String regNo);

    List<Doctor> getAllDoctors();
}
