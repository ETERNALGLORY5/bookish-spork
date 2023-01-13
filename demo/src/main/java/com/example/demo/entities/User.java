package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Players")

public class User {
    @Column(name="PLAYER_NAME",length=100)
    private String name;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="PLAYER_ID")
    private int id;


    @Column(name="PLAYER_CITY", length =50)
    private String city;

    @Column(name="PLAYER_AGE", length =2)
    private int age;

    
    public User(String name, int id, String city, int age) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.age = age;
    }


    public User() {
    }


    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", city=" + city + ", age=" + age + "]";
    }



    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    

    

}
