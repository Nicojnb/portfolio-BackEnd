package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Attitudes;
import java.util.List;

public interface IAttitudesService {
    
    public List<Attitudes>getAttit();
    
    public void createAttit(Attitudes attit);
    
    //public void searchAchiev();
    
    public void updateAttit(Attitudes attit);
    
    public void deleteAttit(Integer id);
}
