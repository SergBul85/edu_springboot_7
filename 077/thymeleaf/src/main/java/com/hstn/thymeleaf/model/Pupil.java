package com.hstn.thymeleaf.model;

public class Pupil {
    private String firstName;
    private String lastName;
    private String sex;
    private String city;

    public Pupil() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Pupil{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", sex='" + sex + '\'' +
               ", city='" + city + '\'' +
               '}';
    }


}
