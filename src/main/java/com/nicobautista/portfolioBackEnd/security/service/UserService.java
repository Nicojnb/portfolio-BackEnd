package com.nicobautista.portfolioBackEnd.security.service;

import com.nicobautista.portfolioBackEnd.security.entity.User;
import com.nicobautista.portfolioBackEnd.security.repository.UserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    
    @Autowired
    UserRepository userRepository;
    
    public Optional<User> getByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
    
    public boolean checkUserName(String userName){
        return userRepository.existsByUserName(userName);
    }
    
    public boolean checkEmail(String email){
        return userRepository.existsByEmail(email);
    }
    
    public void save(User user){
        userRepository.save(user);
    }
            
}
