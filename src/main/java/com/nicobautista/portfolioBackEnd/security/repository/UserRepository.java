package com.nicobautista.portfolioBackEnd.security.repository;

import com.nicobautista.portfolioBackEnd.security.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    Optional<User> findByUserName(String nameUser);
    
    boolean existsByUserName(String nameUser);
    
    boolean existsByEmail(String email);
}
