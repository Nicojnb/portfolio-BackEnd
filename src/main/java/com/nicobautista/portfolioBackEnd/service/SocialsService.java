package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Socials;
import com.nicobautista.portfolioBackEnd.repository.SocialsRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialsService implements ISocialsService{
    
    @Autowired
    public SocialsRep socialsRep;
    
    @Override
    public List<Socials> getSocials() {
        return socialsRep.findAll();
    }

    @Override
    public void createSocial(Socials soc) {
        socialsRep.save(soc);
    }

    @Override
    public void updateSocial(Socials soc) {
        socialsRep.save(soc);
    }

    @Override
    public void deleteSocial(Integer id) {
        socialsRep.deleteById(id);
    }

    


}
