package com.nicobautista.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Socials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSocial;
    private String name;
    private String url;
    private String icon;
    private String title;
    private String color;
    private Integer userId;

    public Socials(Integer idSocial, String name, String url, String icon, String title, String color, Integer userId) {
        this.idSocial = idSocial;
        this.name = name;
        this.url = url;
        this.icon = icon;
        this.title = title;
        this.color = color;
        this.userId = userId;
    }
    
    public Socials() {
    }
    
    
}
