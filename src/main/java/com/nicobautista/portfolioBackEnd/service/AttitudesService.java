package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Attitudes;
import com.nicobautista.portfolioBackEnd.repository.AttitudRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttitudesService implements IAttitudesService{

    @Autowired
    public AttitudRep attitudRep;

    @Override
    public List<Attitudes> getAttit() {
        return attitudRep.findAll();
    }

    @Override
    public void createAttit(Attitudes attit) {
        attitudRep.save(attit);
    }

    @Override
    public void updateAttit(Attitudes attit) {
        attitudRep.save(attit);
    }

    @Override
    public void deleteAttit(Integer id) {
        attitudRep.deleteById(id);
    }
    
  
    
}
