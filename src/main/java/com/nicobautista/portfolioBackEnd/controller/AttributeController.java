package com.nicobautista.portfolioBackEnd.controller;

import com.nicobautista.portfolioBackEnd.model.Attributes;
import com.nicobautista.portfolioBackEnd.service.IAttributeService;
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
@RequestMapping("/attrib")
public class AttributeController{

    @Autowired
    private IAttributeService attributeService;
    
    @GetMapping("/{Id}")
    @ResponseBody
    public List<Attributes> get(@PathVariable Integer Id) {
        return attributeService.getAttrib(Id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Attributes obj) {
        attributeService.createAttrib(obj);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Attributes obj) {
        attributeService.updateAttrib(obj);
    }

    @DeleteMapping("/delete/{Id}")
    public void erase(@PathVariable Integer Id) {
        attributeService.deleteAttrib(Id);
    }
    
}
