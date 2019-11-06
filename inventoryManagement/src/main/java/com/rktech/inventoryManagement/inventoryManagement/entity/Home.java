package com.rktech.inventoryManagement.inventoryManagement.entity;


import javax.persistence.*;

@Entity
@Table(name = "home")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name ;
    private String collegename;
    private  int roll;
    public Home() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Home{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", collegename='" + collegename + '\'' +
                ", roll=" + roll +
                '}';
    }
}
