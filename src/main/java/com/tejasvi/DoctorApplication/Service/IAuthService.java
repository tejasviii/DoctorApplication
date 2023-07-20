package com.tejasvi.DoctorApplication.Service;

import com.tejasvi.DoctorApplication.Model.AuthenticationToken;
import com.tejasvi.DoctorApplication.Model.Patient;

public interface IAuthService {

    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(Patient patient);
    boolean authenticate(String userEmail, String token);


}