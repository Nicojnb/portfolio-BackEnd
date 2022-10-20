package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Experience;
import com.nicobautista.portfolioBackEnd.service.IExperienceService;
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
@RequestMapping("/experience")
public class ExperienceController{

    @Autowired
    private IExperienceService experienceService;
    
    @GetMapping("/")
    @ResponseBody
    public List<Experience> get() {
        return experienceService.getExperience();
    }

    @PostMapping("/add")
    public void add(@RequestBody Experience obj) {
        experienceService.createExperience(obj);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Experience obj) {
        experienceService.updateExperience(obj);
    }

    @DeleteMapping("/delete/{Id}")
    public void erase(@PathVariable Integer Id) {
        experienceService.deleteExperience(Id);
    }
    
}
