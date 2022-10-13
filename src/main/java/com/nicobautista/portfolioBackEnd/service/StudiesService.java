package com.nicobautista.portfolioBackEnd.service;

import com.nicobautista.portfolioBackEnd.model.Studies;
import com.nicobautista.portfolioBackEnd.repository.StudiesRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudiesService implements IStudiesService{
    
    @Autowired
    public StudiesRep studiesRep;

    @Override
    public List<Studies> getStudies(Integer persId) {
        return studiesRep.findAll();
    }

    @Override
    public void createStudy(Studies stud) {
        studiesRep.save(stud);
    }

    @Override
    public void updateStudy(Studies stud) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteStudy(Integer id) {
        studiesRep.deleteById(id);
    }

    
}
