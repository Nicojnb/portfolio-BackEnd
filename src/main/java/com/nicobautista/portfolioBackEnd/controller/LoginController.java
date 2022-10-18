package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Credentials;
import com.nicobautista.portfolioBackEnd.service.ILoginService;
import jdk.jfr.BooleanFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @Autowired
    private ILoginService loginService;
    
    @GetMapping("/login")
    @ResponseBody
    public Integer getAchiev(@RequestBody Credentials cred){
        return loginService.loginSucces(cred);
    }
    
    
}
