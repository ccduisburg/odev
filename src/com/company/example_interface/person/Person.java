package com.company.example_interface.person;

import java.util.Date;

public class Person {
    Integer id;
    String name;
    String nachName;
    Date birthDate;

    public Person(Integer id, String name, String nachName, Date birthDate) {
        this.id = id;
        this.name = name;
        this.nachName = nachName;
        this.birthDate = birthDate;
    }

    public Person(String name, String nachName, Date birthDate) {
        this.name = name;
        this.nachName = nachName;
        this.birthDate = birthDate;
    }

    public Person(Integer id, String name, String nachName) {
        this.id = id;
        this.name = name;
        this.nachName = nachName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nachName='" + nachName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
