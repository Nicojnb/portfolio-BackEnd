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
    public List<Attitudes> getAttit(Integer persId) {
        return attitudRep.findAllByUserId(persId);
    }

    @Override
    public void createAttit(Attitudes attit) {
        attitudRep.save(attit);
    }

    @Override
    public void updateAttit(Attitudes attit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAttit(Integer id) {
        attitudRep.deleteById(id);
    }
    
  
    
}
