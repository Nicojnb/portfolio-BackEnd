package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Credentials;
import com.nicobautista.portfolioBackEnd.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @Autowired
    private ILoginService loginService;
    
    @PostMapping("/login")
    public Integer loggin(@RequestBody Credentials cred){
        return loginService.loginSucces(cred);
    }
    
    
}
