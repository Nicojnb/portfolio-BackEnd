package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Studies;
import java.util.List;

public interface IStudiesService {
            
    public List<Studies>getStudies(Integer persId);
    
    public void createStudy(Studies stud);
    
    //public void searchAchiev();
    
    public void updateStudy(Studies stud);
    
    public void deleteStudy(Integer id);
}
