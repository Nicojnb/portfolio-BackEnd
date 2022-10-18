package com.nicobautista.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Attitudes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer percent;
    private Integer userId;

    public Attitudes(Integer id, String name, String description, Integer percent, Integer userId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.percent = percent;
        this.userId = userId;
    }

    public Attitudes() {
    }
    
    
}
