package com.maksi.belajarloginapi.services;

import com.maksi.belajarloginapi.request.LoginRequest;
import com.maksi.belajarloginapi.model.UserDetail;
import com.maksi.belajarloginapi.repository.UserDetailRepo;
import com.maksi.belajarloginapi.response.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {

    @Autowired
    public UserDetailRepo userDetailRepo;

    public UserDetail save(UserDetail userDetail) {
        return userDetailRepo.save(userDetail);
    }

    public APIResponse login(LoginRequest loginRequest) {
        APIResponse apiResponse = new APIResponse();

        UserDetail user = userDetailRepo.findOneByUsernameIgnoreCaseAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if (user == null) {
            apiResponse.setMassage("Login Failed");
            apiResponse.setError("Username or Password don't match");
            return apiResponse;
        } else {
            apiResponse.setMassage("Login Success");
            apiResponse.setError("username and Password is match");
            return apiResponse;
        }
    }
}
