package com.nicobautista.portfolioBackEnd.repository;

import com.nicobautista.portfolioBackEnd.model.Attitudes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttitudRep extends JpaRepository<Attitudes, Integer>{
    
    public List<Attitudes> findAllByUserId(Integer userId);
}
