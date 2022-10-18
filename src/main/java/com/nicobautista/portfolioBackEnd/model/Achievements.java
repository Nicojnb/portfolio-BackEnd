package com.nicobautista.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Achievements {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String url;
    private Integer userId;

    public Achievements(Integer id, String name, String description, String url, Integer userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.userId = userId;
    }
    
    public Achievements() {
    }

    
}


