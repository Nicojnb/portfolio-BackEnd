package com.nicobautista.portfolioBackEnd.repository;

import com.nicobautista.portfolioBackEnd.model.Studies;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudiesRep extends JpaRepository<Studies, Integer>{
    
    public List<Studies> findAllByUserId(Integer userId);
}
