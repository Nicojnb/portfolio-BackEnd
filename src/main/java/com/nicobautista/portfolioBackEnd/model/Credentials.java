package com.nicobautista.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pass;
    private String email;
    private Integer userID;

    public Credentials(Integer id, String pass, String email, Integer userID) {
        this.id = id;
        this.pass = pass;
        this.email = email;
        this.userID = userID;
    }

    public Credentials() {
    }
    
    
}
