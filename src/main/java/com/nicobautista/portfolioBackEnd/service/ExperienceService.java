package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Experience;
import com.nicobautista.portfolioBackEnd.repository.ExperienceRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService{

    @Autowired
    public ExperienceRep experienceRep;

    @Override
    public List<Experience> getExperience() {
        return experienceRep.findAll();
    }

    @Override
    public void createExperience(Experience exp) {
        experienceRep.save(exp);
    }

    @Override
    public void updateExperience(Experience exp) {
        experienceRep.save(exp);
    }

    @Override
    public void deleteExperience(Integer id) {
        experienceRep.deleteById(id);
    }
    
   
}
