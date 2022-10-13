package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Studies;
import com.nicobautista.portfolioBackEnd.service.IStudiesService;
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

@RestController
@RequestMapping("/studies")
public class StudyController{

    @Autowired
    private IStudiesService studiesService;
    
    @GetMapping("/{Id}")
    @ResponseBody
    public List<Studies> get(@PathVariable Integer Id) {
        return studiesService.getStudies(Id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Studies stu) {
        studiesService.createStudy(stu);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Studies stu) {
        studiesService.updateStudy(stu);
    }

    @DeleteMapping("/erase/{Id}")
    public void erase(@PathVariable Integer Id) {
        studiesService.deleteStudy(Id);
    }
    
}
