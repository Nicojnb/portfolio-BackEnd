package com.nicobautista.portfolioBackEnd.security.controller;

import com.nicobautista.portfolioBackEnd.security.dto.JwtDTO;
import com.nicobautista.portfolioBackEnd.security.dto.Login;
import com.nicobautista.portfolioBackEnd.security.dto.Message;
import com.nicobautista.portfolioBackEnd.security.dto.NewUser;
import com.nicobautista.portfolioBackEnd.security.entity.Role;
import com.nicobautista.portfolioBackEnd.security.entity.User;
import com.nicobautista.portfolioBackEnd.security.enums.RoleName;
import com.nicobautista.portfolioBackEnd.security.jwt.JwtProvider;
import com.nicobautista.portfolioBackEnd.security.service.RoleService;
import com.nicobautista.portfolioBackEnd.security.service.UserService;
import java.util.HashSet;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
//@CrossOrigin(origins = "*")
public class UserController {
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    UserService userService;
    
    @Autowired
    RoleService roleService;
    
    @Autowired
    JwtProvider jwtProvider;
    
    @PostMapping("/new")
    public ResponseEntity<?> nuevo (@Valid @RequestBody NewUser newUser, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Message("error en los campos, o imeil invalido"), HttpStatus.BAD_REQUEST);
        if(userService.checkUserName(newUser.getUserName()))
            return new ResponseEntity(new Message("ya existe el nombre"), HttpStatus.BAD_REQUEST);
        if(userService.checkEmail(newUser.getEmail()))
            return new ResponseEntity(new Message("ya existe el imeil"), HttpStatus.BAD_REQUEST);
        User user = new User(newUser.getName(), newUser.getUserName(), newUser.getEmail(), passwordEncoder.encode(newUser.getPassword()));
        Set <Role> roles = new HashSet<>();
        roles.add(roleService.getByRoleName(RoleName.ROLE_USER).get());
        if(newUser.getRoles().contains("admin"))
            roles.add(roleService.getByRoleName(RoleName.ROLE_ADMIN).get());
        user.setRoles(roles);
        userService.save(user);
        return new ResponseEntity(new Message("usuario creado"), HttpStatus.CREATED);
    }
    
    @PostMapping("/login")
    public ResponseEntity<JwtDTO> loggin(@Valid @RequestBody Login login, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Message("campos mal puestos"), HttpStatus.BAD_REQUEST);
        Authentication authentication = 
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login.getUserName(), login.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
        JwtDTO jwtDTO = new JwtDTO(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        return new ResponseEntity(jwtDTO, HttpStatus.OK);
    }
}
