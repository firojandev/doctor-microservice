package com.ehome2u.doctormicroservice.infrastructure.repository;

import com.ehome2u.doctormicroservice.domain.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Custom query methods can be defined here if needed
}
