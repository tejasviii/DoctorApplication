package com.tejasvi.DoctorApplication.Repository;

import com.tejasvi.DoctorApplication.Model.Appointment;
import com.tejasvi.DoctorApplication.Model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}