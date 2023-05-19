package com.example.DoctorApplication.Service;

import com.example.DoctorApplication.Model.AuthenticationToken;
import com.example.DoctorApplication.Model.Patient;

public interface IAuthService {

    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(Patient patient);
    boolean authenticate(String userEmail, String token);


}