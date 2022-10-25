package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Achievements;
import com.nicobautista.portfolioBackEnd.service.IAchievService;
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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/achievs")
public class AchievController {
    
    @Autowired
    private IAchievService achievService;
    
    @GetMapping("/")
    @ResponseBody
    public List<Achievements> getAchiev(){
        return achievService.getAchiev();
    }
    
    @PostMapping("/add")
    public void addAchiev(@RequestBody Achievements ach){
        achievService.createAchiev(ach);
    }
    
    @PutMapping("/edit")
    public void editAchiev(@RequestBody Achievements ach){
        achievService.updateAchiev(ach);
    }
    
    @DeleteMapping("/delete/{Id}")
    public void eraseAchiev(@PathVariable Integer Id){
        achievService.deleteAchiev(Id);
    }
}
