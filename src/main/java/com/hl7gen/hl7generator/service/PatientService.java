package com.hl7gen.hl7generator.service;

import com.hl7gen.hl7generator.exception.UserNotFoundException;
import com.hl7gen.hl7generator.model.Patient;
import com.hl7gen.hl7generator.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepo patientRepo;

    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public List<Patient> getPatient() {
        return patientRepo.findAll();
    }

    public Patient findPatientById(Long id) throws Throwable {
        return patientRepo.findPatientById(id).
                orElseThrow(() -> new UserNotFoundException("Patient by id" + id + "was not found"));
    }

    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public void deletePatient(Long id) {
        patientRepo.deletePatientById(id);
    }
}
