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
        return userRepository.findByNameUser(userName);
    }
    
    public boolean checkUserName(String userName){
        return userRepository.existByNameUser(userName);
    }
    
    public boolean checkEmail(String email){
        return userRepository.existByEmail(email);
    }
    
    public void save(User user){
        userRepository.save(user);
    }
            
}
