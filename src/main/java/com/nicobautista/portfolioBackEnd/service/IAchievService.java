package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Achievements;
import java.util.List;

public interface IAchievService {
    
    public List<Achievements>getAchiev(Integer persId);
    
    public void createAchiev(Achievements ach);
    
    //public void searchAchiev();
    
    public void updateAchiev(Achievements ach);
    
    public void deleteAchiev(Integer id);
}
