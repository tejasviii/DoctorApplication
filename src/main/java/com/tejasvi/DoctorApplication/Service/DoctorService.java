package com.tejasvi.DoctorApplication.Service;

import com.tejasvi.DoctorApplication.Model.Appointment;
import com.tejasvi.DoctorApplication.Model.Doctor;
import com.tejasvi.DoctorApplication.Repository.IDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    IDoctorRepo doctorRepo;

    public void addDoc(Doctor doc) {
        doctorRepo.save(doc);
    }

    public List<Doctor> getAllDoctors() {
        List<Doctor> allDoctors = doctorRepo.findAll();
        return allDoctors;

    }

    public List<Appointment> getMyAppointments(Long docId) {

        Doctor myDoc = doctorRepo.findByDoctorId(docId);

        if(myDoc == null)
        {
            throw new IllegalStateException("The doctor does not exist");
        }

        return myDoc.getAppointments();
    }

}
