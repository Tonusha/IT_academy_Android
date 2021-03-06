package by.nca.it_academy.work.hw6;

import java.io.Serializable;

/**
 * Created by user on 23.02.2018.
 */
public class People implements Serializable {

    private int id;
    private String name;
    private String surname;
    private Integer age;
    private boolean isDegree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isDegree() {
        return isDegree;
    }

    public void setDegree(boolean degree) {
        isDegree = degree;
    }
} 