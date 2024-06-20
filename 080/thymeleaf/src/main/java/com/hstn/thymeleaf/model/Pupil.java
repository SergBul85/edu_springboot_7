package com.hstn.thymeleaf.model;

import java.util.List;

public class Pupil {
    private String firstName;
    private String lastName;
    private String sex;
    private String city;
    private String favouriteDrink;
    private List<String> favouriteCars;

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

    public String getFavouriteDrink() {
        return favouriteDrink;
    }

    public void setFavouriteDrink(String favouriteDrink) {
        this.favouriteDrink = favouriteDrink;
    }

    public List<String> getFavouriteCars() {
        return favouriteCars;
    }

    public void setFavouriteCars(List<String> favouriteCars) {
        this.favouriteCars = favouriteCars;
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
