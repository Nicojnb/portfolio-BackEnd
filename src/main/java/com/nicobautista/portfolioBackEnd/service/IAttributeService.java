package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Attributes;
import java.util.List;

public interface IAttributeService {
    
    public List<Attributes> getAttrib();
    
    public void createAttrib(Attributes attrib);
    
    //public void searchAchiev();
    
    public void updateAttrib(Attributes attrib);
    
    public void deleteAttrib(Integer id);
}
