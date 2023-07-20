package com.tejasvi.DoctorApplication.Repository;

import com.tejasvi.DoctorApplication.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor, Long> {


    Doctor findByDoctorId(Long docId);
}