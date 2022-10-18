package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Achievements;
import com.nicobautista.portfolioBackEnd.repository.AchievRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchievService implements IAchievService{
    
    @Autowired
    public AchievRep achievRep;
    
    @Override
    public List<Achievements> getAchiev(Integer persId) {
        return achievRep.findAllByUserId(persId);
    }

    @Override
    public void createAchiev(Achievements ach) {
        achievRep.save(ach);
    }
    
    @Override
    public void updateAchiev(Achievements ach) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void deleteAchiev(Integer id) {
        achievRep.deleteById(id);
    }

    
}
