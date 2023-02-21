package model;

import java.util.Date;

public class Person {
    protected String name;
    protected String surname;
    protected String email;
    protected String gender;
    protected Date dateOfBirth;

    public Person(String name, String surname, String email, String gender, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
