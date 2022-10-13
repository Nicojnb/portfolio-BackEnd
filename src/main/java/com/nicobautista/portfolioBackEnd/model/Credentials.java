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
    private Integer idCred;
    private String user_;
    private String pass_;
    private String email;
    private Integer userID;

    public Credentials(Integer idCred, String user_, String pass_, String email, Integer userID) {
        this.idCred = idCred;
        this.user_ = user_;
        this.pass_ = pass_;
        this.email = email;
        this.userID = userID;
    }
    
    public Credentials() {
    }
    
    
}
