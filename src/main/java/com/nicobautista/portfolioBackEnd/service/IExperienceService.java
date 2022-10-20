package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Experience;
import java.util.List;

public interface IExperienceService {
    
    public List<Experience>getExperience();
    
    public void createExperience(Experience exp);
    
    //public void searchAchiev();
    
    public void updateExperience(Experience exp);
    
    public void deleteExperience(Integer id);
}
