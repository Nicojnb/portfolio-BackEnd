package com.nicobautista.portfolioBackEnd.repository;

import com.nicobautista.portfolioBackEnd.model.Socials;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialsRep extends JpaRepository<Socials, Integer>{

    public List<Socials> findAllByUserId(Integer userId);
    
}
