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
    private String name;
    private String type;
    private String title;
    private String status;
    private Integer start;
    private Integer end;
    private Integer userId;

    public Studies(Integer id, String name, String type, String title, String status, Integer start, Integer end, Integer userId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.title = title;
        this.status = status;
        this.start = start;
        this.end = end;
        this.userId = userId;
    }

    public Studies() {
    }
    
    
}
