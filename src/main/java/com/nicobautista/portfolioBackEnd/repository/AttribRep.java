package com.nicobautista.portfolioBackEnd.repository;

import com.nicobautista.portfolioBackEnd.model.Attributes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttribRep extends JpaRepository<Attributes, Integer>{
    
    public List<Attributes> findAllByUserId(Integer userId);
}
