package com.example.DoctorApplication.Repository;

import com.example.DoctorApplication.Model.AuthenticationToken;
import com.example.DoctorApplication.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}
