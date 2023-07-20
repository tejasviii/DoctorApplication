package com.tejasvi.DoctorApplication.Repository;

import com.tejasvi.DoctorApplication.Model.AuthenticationToken;
import com.tejasvi.DoctorApplication.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}