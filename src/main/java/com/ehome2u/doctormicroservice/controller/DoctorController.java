package com.ehome2u.doctormicroservice.controller;

import com.ehome2u.doctormicroservice.domain.model.Doctor;
import com.ehome2u.doctormicroservice.domain.usecase.DoctorUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    DoctorUseCaseImpl doctorUseCase;

    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        List<Doctor> doctors = doctorUseCase.getAllDoctors();
        return ResponseEntity.ok(doctors);
    }
}
