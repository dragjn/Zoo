package com.example.zoo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Animal {

    @Id
    @GeneratedValue
    private int id;
}
