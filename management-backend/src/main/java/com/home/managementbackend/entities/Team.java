package com.home.managementbackend.entities;

public class Team {

    public int id;
    public String name;
    public String department; 

    public Team() {
        id = -1;
        name = "Default Team";
        department = "Default Department";
    }

    public Team(int id, String name,String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}
