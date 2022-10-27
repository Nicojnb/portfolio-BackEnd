package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Attitudes;
import com.nicobautista.portfolioBackEnd.service.IAttitudesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/attitud")
public class AttitudController{

    @Autowired
    private IAttitudesService attitudesService;
    
    @GetMapping("/")
    @ResponseBody
    public List<Attitudes> get() {
        return attitudesService.getAttit();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public void add(@RequestBody Attitudes obj) {
        attitudesService.createAttit(obj);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/edit")
    public void edit(@RequestBody Attitudes obj) {
        attitudesService.updateAttit(obj);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{Id}")
    public void erase(@PathVariable Integer Id) {
        attitudesService.deleteAttit(Id);
    }
    
}
