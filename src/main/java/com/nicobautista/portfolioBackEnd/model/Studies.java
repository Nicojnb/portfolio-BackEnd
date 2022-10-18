package com.nicobautista.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Studies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String whereStud;
    private String title;
    private Integer startStud;
    private Integer endStud;
    private Integer userId;

    public Studies(Integer id, String whereStud, String title, Integer startStud, Integer endStud, Integer userId) {
        this.id = id;
        this.whereStud = whereStud;
        this.title = title;
        this.startStud = startStud;
        this.endStud = endStud;
        this.userId = userId;
    }

    public Studies() {
    }
    
    
}
