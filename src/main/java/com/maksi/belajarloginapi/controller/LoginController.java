package com.maksi.belajarloginapi.controller;

import com.maksi.belajarloginapi.request.LoginRequest;
import com.maksi.belajarloginapi.model.UserDetail;
import com.maksi.belajarloginapi.response.APIResponse;
import com.maksi.belajarloginapi.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/signup")
    public UserDetail create(@RequestBody UserDetail userDetail){
        return loginService.save(userDetail);
    }

    @PostMapping("/login")
    public ResponseEntity<APIResponse> login(@RequestBody LoginRequest loginRequest) {
        APIResponse apiResponse = loginService.login(loginRequest);

        return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
    }
}
