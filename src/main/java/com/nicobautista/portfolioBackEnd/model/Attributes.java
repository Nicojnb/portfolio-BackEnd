package com.nicobautista.portfolioBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Attributes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAttr;
    private String firstName;
    private String lastName;
    private String prof;
    private String urlImage;
    private String urlBack;
    private String city;
    private String country;
    private String university;
    private String about;
    private Integer userId;

    public Attributes(Integer idAttr, String firstName, String lastName, String prof, String urlImage, String urlBack, String city, String country, String university, String about, Integer userId) {
        this.idAttr = idAttr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.prof = prof;
        this.urlImage = urlImage;
        this.urlBack = urlBack;
        this.city = city;
        this.country = country;
        this.university = university;
        this.about = about;
        this.userId = userId;
    }

   

    public Attributes() {
    }
    
}
    

