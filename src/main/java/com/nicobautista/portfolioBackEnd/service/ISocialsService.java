package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Socials;
import java.util.List;

public interface ISocialsService {
        
    public List<Socials>getSocials(Integer persId);
    
    public void createSocial(Socials soc);
    
    //public void searchAchiev();
    
    public void updateSocial(Socials soc);
    
    public void deleteSocial(Integer id);
    
}
