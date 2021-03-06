package by.nca.it_academy.work.hw6;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by miruk on 26.02.2018.
 */
public class PeopleClass implements Serializable {

    private String name;
    private int gender;
    private Date date;
    private List<People> people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }
} 
