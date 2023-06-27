package com.example.servlet_table;

public class Customer {
    private String name;
    private String lastName;
    private Integer age;
    private String city;
    private String adress;
    private String gender;
    private String children;
    private Integer countryVisited;


    public Customer(String name, String lastName, Integer age, String city, String adress, String gender, String children, Integer countryVisited) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.adress = adress;
        this.gender = gender;
        this.children = children;
        this.countryVisited = countryVisited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public Integer getCountryVisited() {
        return countryVisited;
    }

    public void setCountryVisited(Integer countryVisited) {
        this.countryVisited = countryVisited;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", adress='" + adress + '\'' +
                ", gender=" + gender +
                ", children='" + children + '\'' +
                ", countryVisited='" + countryVisited +
                '}';

    }

}
