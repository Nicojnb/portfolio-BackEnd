package com.nicobautista.portfolioBackEnd.security.repository;

import com.nicobautista.portfolioBackEnd.security.entity.Role;
import com.nicobautista.portfolioBackEnd.security.enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    
    Optional<Role> findByRoleName(RoleName roleName);
}
