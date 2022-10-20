package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Socials;
import com.nicobautista.portfolioBackEnd.service.ISocialsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/socials")
public class SocialController{
    
    @Autowired
    private ISocialsService socialsService;
    
    @GetMapping("/")
    @ResponseBody
    public List<Socials> getSocials(){
        return socialsService.getSocials();
    }
    
    @PostMapping("/add")
    public void add(@RequestBody Socials obj) {
        socialsService.createSocial(obj);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Socials obj) {
        socialsService.updateSocial(obj);
    }

    @DeleteMapping("/delete/{Id}")
    public void erase(@PathVariable Integer Id) {
        socialsService.deleteSocial(Id);
    }
    
    
}
