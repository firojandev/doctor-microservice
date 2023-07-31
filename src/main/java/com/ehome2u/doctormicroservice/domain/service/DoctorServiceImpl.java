package com.ehome2u.doctormicroservice.domain.service;

import com.ehome2u.doctormicroservice.domain.model.Doctor;
import com.ehome2u.doctormicroservice.infrastructure.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public Doctor createDoctor(String name, String regNo) {
        Doctor product = new Doctor();
        product.setName(name);
        product.setRegNo(regNo);
        return doctorRepository.save(product);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
