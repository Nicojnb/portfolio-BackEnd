package com.nicobautista.portfolioBackEnd.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String role;
    private Date start;
    private Date end;
    private Integer userId;

    public Experience(Integer id, String name, String role, Date start, Date end, Integer userId) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.start = start;
        this.end = end;
        this.userId = userId;
    }

    public Experience() {
    }
    
    
}
