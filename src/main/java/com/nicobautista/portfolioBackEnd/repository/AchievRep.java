package com.nicobautista.portfolioBackEnd.repository;

import com.nicobautista.portfolioBackEnd.model.Achievements;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievRep extends JpaRepository<Achievements, Integer>{
    
    public List<Achievements> findAllByUserId(Integer userId);
}
