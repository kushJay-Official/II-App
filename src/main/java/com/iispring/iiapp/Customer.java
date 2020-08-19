package com.iispring.iiapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String Name;
    private String Surname;

    public Integer getId(){
        return id;
    }
    public void setId(Integer i){
        this.id=i;
    }
    public String getFirstName(){
        return Name;
    }
    public String getSurName(){
        return Surname;
    }
    public void setFirstName(String n){
        this.Name=n;
    }
    public void setSurName(String s){
        this.Surname=s;
    }
}
