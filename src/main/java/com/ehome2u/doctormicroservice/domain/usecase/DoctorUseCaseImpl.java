package com.ehome2u.doctormicroservice.domain.usecase;

import com.ehome2u.doctormicroservice.domain.model.Doctor;
import com.ehome2u.doctormicroservice.domain.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DoctorUseCaseImpl implements DoctorUseCase{

    @Autowired
    DoctorService doctorService;

    @Override
    public Doctor createDoctor(String name, String regNo) {
        return doctorService.createDoctor(name,regNo);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
}
