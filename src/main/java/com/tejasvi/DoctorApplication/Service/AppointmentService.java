package com.tejasvi.DoctorApplication.Service;

import com.tejasvi.DoctorApplication.Model.Appointment;
import com.tejasvi.DoctorApplication.Model.AppointmentKey;
import com.tejasvi.DoctorApplication.Repository.IAppointmentRepo;
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