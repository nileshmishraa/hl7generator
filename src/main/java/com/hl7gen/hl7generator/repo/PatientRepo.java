package com.hl7gen.hl7generator.repo;

import com.hl7gen.hl7generator.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<Patient, Long> {

    void deletePatientById(Long id);

    Optional<Patient> findPatientById(Long id);
}
