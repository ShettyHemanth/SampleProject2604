package com.hemanth.FrontEndBackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Student
{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;



    String name;




    String branch;


    String email;



}
