package com.nicobautista.portfolioBackEnd.security.service;

import com.nicobautista.portfolioBackEnd.security.entity.Role;
import com.nicobautista.portfolioBackEnd.security.enums.RoleName;
import com.nicobautista.portfolioBackEnd.security.repository.RoleRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    RoleRepository roleRepository;
    
    public Optional<Role> getByRoleName(RoleName roleName){
        return roleRepository.findByRoleName(roleName);
    }
    
    
}
