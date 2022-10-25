package com.nicobautista.portfolioBackEnd.security.repository;

import com.nicobautista.portfolioBackEnd.security.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    Optional<User> findByNameUser(String nameUser);
    
    boolean existByNameUser(String nameUser);
    
    boolean existByEmail(String email);
}
