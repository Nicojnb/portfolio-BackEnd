package com.nicobautista.portfolioBackEnd.repository;

import com.nicobautista.portfolioBackEnd.model.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRep extends JpaRepository<Experience, Integer>{
    
    public List<Experience> findAllByUserId(Integer userId);
}
