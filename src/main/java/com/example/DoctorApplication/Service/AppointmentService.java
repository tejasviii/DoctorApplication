package com.example.DoctorApplication.Service;

import com.example.DoctorApplication.Model.Appointment;
import com.example.DoctorApplication.Model.AppointmentKey;
import com.example.DoctorApplication.Repository.IAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    public void bookAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}