package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Attributes;
import com.nicobautista.portfolioBackEnd.repository.AttribRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeService implements IAttributeService{
    
    @Autowired
    public AttribRep attribRep;

    @Override
    public List<Attributes> getAttrib(Integer persId) {
        return attribRep.findAll();
    }

    @Override
    public void createAttrib(Attributes attrib) {
        attribRep.save(attrib);
    }

    @Override
    public void updateAttrib(Attributes attrib) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAttrib(Integer id) {
        attribRep.deleteById(id);
    }

   
    
}
