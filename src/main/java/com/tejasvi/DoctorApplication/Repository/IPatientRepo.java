package com.tejasvi.DoctorApplication.Repository;

import com.tejasvi.DoctorApplication.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient, Long> {

    Patient findFirstByPatientEmail(String userEmail);
}