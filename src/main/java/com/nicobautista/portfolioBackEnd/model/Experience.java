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
    private Integer idExp;
    private String whereJob;
    private String roleJob;
    private Date startJob;
    private Date endJob;
    private Integer userId;

    public Experience(Integer idExp, String whereJob, String roleJob, Date startJob, Date endJob, Integer userId) {
        this.idExp = idExp;
        this.whereJob = whereJob;
        this.roleJob = roleJob;
        this.startJob = startJob;
        this.endJob = endJob;
        this.userId = userId;
    }

    public Experience() {
    }
    
    
}